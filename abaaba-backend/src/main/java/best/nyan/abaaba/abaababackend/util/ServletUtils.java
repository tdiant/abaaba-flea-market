package best.nyan.abaaba.abaababackend.util;

import best.nyan.abaaba.abaababackend.entity.AuthenticatedUser;
import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import best.nyan.abaaba.abaababackend.exception.ServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static best.nyan.abaaba.abaababackend.AbaabaBackendApplication.globalObjMapper;

public class ServletUtils {

    public static <T> void renderDirectly(HttpServletResponse response, ResponseResult<T> result) {
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            System.out.println(result);
            response.getWriter().println(
                    globalObjMapper.writeValueAsString(result)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Authentication getContextAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static AuthenticatedUser getAuthenticatedUser() {
        try {
            return (AuthenticatedUser) getContextAuthentication().getPrincipal();
        } catch (Exception e) {
            throw new ServiceException(
                    ResponseResult.authFailed("Failed to get the details with login status.")
            );
        }
    }

    public static ServletRequestAttributes getRequestAttributes() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes) attributes;
    }

    public static HttpServletRequest getRequest() {
        return getRequestAttributes().getRequest();
    }

    public static String getIpAddr() {
        HttpServletRequest request = getRequest();

        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : getMultistageReverseProxyIp(ip);
    }

    public static String getMultistageReverseProxyIp(String ip) {
        // 多级反向代理检测
        if (ip != null && ip.indexOf(",") > 0) {
            final String[] ips = ip.trim().split(",");
            for (String subIp : ips) {
                if (!(subIp.isEmpty() || subIp.isBlank() || "unknown".equalsIgnoreCase(subIp))) {
                    ip = subIp;
                    break;
                }
            }
        }
        return ip;
    }

}
