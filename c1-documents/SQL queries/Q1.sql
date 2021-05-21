select p.prod_desc, p.prod_name, p.prod_price 
from cartitem as ci
	right join product as p
	on ci.productidfk = p.productid
	right join cart as c
	on ci.cartidfk = c.cartid
where c.cartid = 1;

select * 
from cartitem;

select *
from cart;

select *
from product;

select *
from address;