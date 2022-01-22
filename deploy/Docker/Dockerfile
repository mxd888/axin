# 环境
FROM java:8
# 作者信息
MAINTAINER mxd
#拷贝
ADD run.sh /run.sh
ADD axin-0.0.1-SNAPSHOT.jar /axin.jar
ADD t-im-server-demo-2.1.7.v20220120-RELEASE-jar-with-dependencies /t-im-server.jar
# RUN命令
RUN chmod 777 /run.sh 
# 执行命令
ENTRYPOINT ["sh","-c","./run.sh"]