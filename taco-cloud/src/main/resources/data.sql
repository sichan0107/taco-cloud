delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;

delete from Ingredient;

insert into Ingredient(id, name, type)
	values ('FLTO', '밀가루 또띠아', 'WRAP');
insert into Ingredient(id, name, type)
	values ('COTO', '옥수수 또띠아', 'WRAP');

insert into Ingredient(id, name, type)
	values ('GRBF', '소고기', 'PROTEIN');

insert into Ingredient(id, name, type)
	values ('CARN', '곱창', 'PROTEIN');

insert into Ingredient(id, name, type)
	values ('TMTO', '토마토', 'VEGGIES');

insert into Ingredient(id, name, type)
	values ('LETC', '양상추', 'VEGGIES');

insert into Ingredient(id, name, type)
	values ('CHED', '체다치즈', 'CHEESE');
insert into Ingredient(id, name, type)
	values ('JACK', '몬테리잭', 'CHEESE');
insert into Ingredient(id, name, type)
	values ('SLSA', '살사소스', 'SAUCE');
insert into Ingredient(id, name, type)
	values ('SRCR', '사워크림', 'SAUCE');