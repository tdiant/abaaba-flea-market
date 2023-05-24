<template>
  <div class="home-recommend-item"
       @mouseover="handleExpandOn"
       @mouseleave="handleExpandOff">
    <div class="item-main-img" :class="[expandMode?(displayToRight?'expand-right':'expand-left'):'']">
      item-main-img
    </div>
    <div class="item-description" :class="[expandMode?(displayToRight?'expand-right':'expand-left'):'']">
      <div class="item-description-main">
        <p :class="['item-title', expandMode?'expand':'']">
          商品标题名称balabalabala
        </p>
        <p :class="['item-brief-description', expandMode?'expand':'']">
          商品介绍balabalabalabalabalab
        </p>
      </div>
      <div class="item-more-url">
        <div class="count">
          <span :class="['price', expandMode?'expand':'']">
            ¥1145.14
          </span>
        </div>
        <div style="flex-grow: 1;"/>
        <div :class="['buttons', expandMode?'expand':'']">
          <span class="more-btn">
            <i class="fa fa-angle-right"/> MORE
          </span>
        </div>
      </div>
    </div>

    <div :class="['floating-block', expandMode?'expand':'', displayToRight?'display-to-right':'display-to-left']">
      <div class="owner-user">
        由
        <i class="user-icon fa fa-user-circle-o"/>
        <span class="username">
          Username
        </span>
        发起
      </div>
      <div class="brief-content">
        <span>
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
          一个更加详细的介绍内容一个更加详细的介绍内容一个更
        </span>
      </div>
      <div class="data-analyse">
        <div class="analyse-main">
          <div class="analyse-item">
            <span class="analyse-cnt">100</span>
            <span class="analyse-title">剩余数量</span>
          </div>
          <div class="analyse-item">
            <span class="analyse-cnt">100%</span>
            <span class="analyse-title">好评率</span>
          </div>
          <div class="analyse-item">
            <span class="analyse-cnt">114514</span>
            <span class="analyse-title">近日浏览</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.home-recommend-item {
  box-shadow: var(--el-box-shadow);
  cursor: pointer;

  .item-main-img {
    background: pink;
    height: 70%;
    border-top-left-radius: 8px;
    border-top-right-radius: 8px;

    border: 1px solid #e2e2e2;

    &.expand-right {
      border-top-right-radius: 0;
    }

    &.expand-left {
      border-top-left-radius: 0;
    }
  }

  .item-description {
    background: #eeeeee;
    height: 30%;
    padding: 10px;

    display: flex;
    flex-direction: column;

    border-bottom-left-radius: 8px;
    border-bottom-right-radius: 8px;

    border: 1px solid #e2e2e2;

    &.expand-right {
      border-bottom-right-radius: 0;
    }

    &.expand-left {
      border-bottom-left-radius: 0;
    }

    .item-description-main {
      height: 100%;

      p {
        padding: 0;
        margin: 0;
      }

      .item-title {
        font-size: 1.1rem;
        font-weight: bold;

        &.expand {
          font-size: 1.28rem;
          transition-property: font-size;
          transition-duration: 0.35s;
        }
      }

      .item-brief-description {
        font-size: 0.9rem;
        overflow: hidden;

        &.expand {
          height: 10px;
          color: rgba(0, 0, 0, 0);
          transition-property: height, color;
          transition-duration: 0.35s, 0.35s;
        }
      }
    }

    .item-more-url {
      display: flex;

      .price {
        font-size: 1.4rem;
        color: #337ecc;

        &.expand {
          font-weight: bold;
          font-size: 1.8rem;
          transition-property: font-size, font-weight;
          transition-duration: 0.3s, 0.3s;
        }
      }

      .buttons {
        display: flex;
        align-items: end;
        font-size: 0.8rem;

        &.expand {
          align-items: center;
          font-size: 0.88rem;
        }
      }

      .more-btn {
        cursor: pointer;
        border: 2px solid #337ecc;
        padding: 2px 6px;
        color: #337ecc;
        border-radius: 6px;

        &:hover {
          background: #3da2ff;
          border: 2px solid rgba(255, 255, 255, 0);
          color: white;
          transition-property: background, color, border;
          transition-duration: 0.36s, 0.3s, 0.3s;
        }
      }
    }
  }

  .floating-block {
    width: 1px;
    height: calc(100% + 1px);
    position: relative;
    top: calc(-100% - 22px);
    opacity: 0;

    display: flex;
    flex-direction: column;
    padding: 10px;

    background: #f4f4f4;
    border: 1px solid #e2e2e2;

    &.expand {
      width: 100%;
      opacity: 1;
      transition-property: left, opacity;
      transition-duration: 0.4s, 0.25s;
    }

    &.display-to-right {
      border-top-right-radius: 6px;
      border-bottom-right-radius: 6px;

      &.expand {
        left: 100%;
        opacity: 1;
        transition-property: opacity;
        transition-duration: 0.35s;
      }
    }

    &.display-to-left {
      border-top-left-radius: 6px;
      border-bottom-left-radius: 6px;

      &.expand {
        left: calc(-100% - 20px);
        opacity: 1;
        transition-property: opacity;
        transition-duration: 0.35s;
      }
    }

    .owner-user {
      color: #434343;
      font-size: 0.9rem;

      .user-icon {
        margin-right: 4px;
        margin-left: 6px;
      }

      .username {
        margin-right: 6px;
      }
    }

    .brief-content {
      height: 68%;
      overflow: hidden;
      font-size: 0.9rem;
    }

    .data-analyse {

      height: 30%;

      .analyse-main {
        text-align: center;
        margin-top: 16px;
        padding: 8px 20px;

        display: flex;

        border: 1px solid #afafaf;
        border-radius: 8px;

        .analyse-item {
          display: flex;
          flex-direction: column;
          width: 100%;

          .analyse-cnt {
            font-size: 1.3rem;
            font-weight: bold;
            color: #337ecc;
          }

          .analyse-title {
            font-size: 0.8rem;
            color: #3e3e3e;
          }
        }
      }

    }
  }
}
</style>

<script>
export default {
  name: "RecommendItem",
  props: {
    displayToRight: {
      type: Boolean,
      default: true
    }
  },
  data() {
    return {
      expandMode: false
    }
  },
  methods: {
    handleExpandOn() {
      this.expandMode = true
    },
    handleExpandOff() {
      this.expandMode = false
    }
  }
}
</script>
