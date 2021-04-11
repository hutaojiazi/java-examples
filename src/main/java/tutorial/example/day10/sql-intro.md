create table books
(
id varchar(255),
name varchar(255),
publisher varchar(255),
category varchar(255),
price numeric(16, 6)
);

insert into books (id, name, publisher, category, price) values
('book003', 'Best tutorial for SQL', 'Tianli Public company', 'Science Fiction', 3.99),
('book004', 'Java for beginners', 'Tianli Public company', 'Science Fiction', 4.99);

select * from books ; -- * all the columns of the table
select id, name from books ;

select * from books
where id = 'book001';

select * from books
where id = 'book001';

select * from books
where id = 'book001' or id = 'book002';   -- satisfait any of the conditions

select * from books
where id = 'book001' and id = 'book002';  -- satisfait all of the conditions

select * from orders
where purchased_by = 'xxx' and purchased_at between '2020-01-01' and '2020-12-31';

-- update
update books set price = 10.99
where id = 'book001';

update books set price = 12.99, publisher = 'Alexis Corporation'
where id = 'book001';

select * from books;

-- delete
delete from books
where id = 'book002';

1: create table    -- CREATE TABLE
2: insert data     -- INSERT
3: retrieve data.  -- SELECT
4: update data:    -- UPDATE
5: remove data     -- DELETE
