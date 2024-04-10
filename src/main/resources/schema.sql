create table product(
    productId int PRIMARY KEY AUTO_INCREMENT,
    productname TEXT,
    price double
);


create table review(
    reviewId int PRIMARYKEY AUTO_INCREMENT,
    reviewContent TEXT,
    rating INTEGER,
    productId INT,
    FOREIGN KEY(productId) REFERENCES product(productId)
);