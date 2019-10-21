# 发版说明
- 生产环境打包压缩js和css文件：gulp pack

- 开发环境需先安装，输入命令：npm install 
- 开发环境运行，输入命令：gulp 或者 gulp dev , 如果提示找不到gulp，则需全局安装gulp，命令：npm install gulp -g
- 生产环境打包压缩js和css文件：gulp pack
- 清除生产环境不需要的文件html： gulp clean

## 代码结构
- html 提供看页面效果的静态文件，后端人员不需要用到，但可以看效果
- css 样式文件目录，对应静态html文件引用哪些路径直接引用
- images 图片目录，对应静态html文件引用哪些路径直接引用
- js js目录，对应静态html文件引用哪些路径直接引用
- - common.js及js目录下js 放公共js，所有页面或者大部分页面需加载的
- - vendor 目录是引用所有插件放的位置
- - module 目录是对应独立页面使用的js
- src 开发源文件

## 项目说明
- 开发人员开发项目都是在src进行开发，其他的不需要动
- src 目录说明
- - less less存储地址
- - - common 公共样式，所有页面或者大部分页面公用的样式
- - - module 子页面样式，可内部件子文件夹
- - - sect 存储less模块，不单独生成css文件，供其他页面引用公共模块样式
- - - _variables.less 变量函数文件，存放变量及方法
- - pug pug存储地址
- - - layout 放pug模板文件
- - - sect 放pug模块文件
- - - views 放独立页面文件
- - gulpfile.js Gulp文件
- - package.json 项目包文件
- - README.md 项目说明文件





