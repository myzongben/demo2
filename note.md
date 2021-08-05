### linux启动运行及关闭服务
#### 启动服务
* 后台启动（即使关闭窗口也不会停止服务）
> nohup java -jar demo2-0.0.1-SNAPSHOT.jar >logs.txt &

直接用java -jar xxx.jar，当退出或关闭shell时，程序就会停止掉。以上方法可让jar运行后一直在后台运行。
#### 停止服务
如果想要关闭java进程，输入命令行
* 列出后台进程
> ps -ef | grep java 
* 杀死进程
> kill -9 xxxx(xxxx为上条命令列出的后台进程的pid， -9 表示无条件终止)
#### 打包报错总结
* 服务启动不起来
 >使用Springboot打成jar，由于使用了嵌入式Tomcat，无需设置地址，只需设置端口即可,无需设置server.address=47.108.64.108
 秩序设置端口server.port= 9527，否在打包到云端会启动不起来，报错Cannot assign requested address,无法绑定地址