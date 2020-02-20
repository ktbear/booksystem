/*create database `ssmbuild`;*/

use `ssmbuild`;

drop table if exists `books`;

create table `books`(`bookID` int(10) not null primary key auto_increment,
            `bookName` varchar(100) not null,
            `bookCounts` int(11) not null,
            `detail` varchar(200) not null
) ENGINE=INNODB DEFAULT CHARSET=utf8;

insert into books(`bookID`,`bookName`,`bookCounts`,`detail`) values(
        1,'Java',1,'从入门到放弃'),(2,'MySQL',10,'从删库到跑路'),(3,'Linux',5,'从进门到进牢');