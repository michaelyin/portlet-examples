CREATE TABLE `customer` (
  `CUSTOMER_ID` bigint NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) NOT NULL,
  `ADDRESS` varchar(36) NOT NULL,
  `CARDID` varchar(11) NOT NULL,
  `CREATED_DATE` timestamp NOT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;