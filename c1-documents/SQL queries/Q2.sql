use c1;

insert into product(productid, prod_desc, prod_name, prod_price, prod_status, prod_votes)
values(1, "Ancient Weapon used by King Purohit", "Talvaar", 99999, True, 50);

insert into product(productid, prod_desc, prod_name, prod_price, prod_status, prod_votes)
values(2, "Original Rigveda Pages", "Panhe", 88888, True, 30);

insert into product(productid, prod_desc, prod_name, prod_price, prod_status, prod_votes)
values(3, "Retro bike engine", "BS 1", 52000, True, 15);

insert into cart(cartid, cart_total)
values(1, 0);

insert into cart(cartid, cart_total)
values(2, 0);

insert into cartitem(itemid, cartidfk, productidfk)
values(1, 1, 2);

insert into cartitem(itemid, cartidfk, productidfk)
values(2, 2, 3);

select * from product;

insert into cartitem(cartidfk, productidfk)
values(1, 1);

insert into cartitem(cartidfk, productidfk)
values(1, 2);
