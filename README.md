# Assaignments
Project name is "LearnAppServerSide"

This project is look like for edx learningapp so that this project name is learnaapp.

How to create this project ?
It is a Springboot project. Spring Initializer through create a project-> (whatever requirements mentioned here...) 
Dependencies are web,Actuator,Devtool,Mysql,Jpa..

This project is a springboot project so it created by three tier layer architechre @RestController,@service,@Repository.Database is a MySql.
it have 1 RestController,1 Service interface,1 Service Impl , 4 Repositories and 4 Domains.

Domains are
1.User
	id
	name 
	age
	region
2. Course
	id
	CourseName
	Inspector

3. PricingComponenet
	id
	coursefees

4. PriceDetails
	id
	gst
	vat
	tax
	conversion charge(region based changed)

@RestController				
LearningAppController		

ServiceInterface
LearningService

@Service
LearningServiceImpl

@Repository
UserRepo
CourseRepo
PricingComponentRepo
PriceDetailsRepo

relationships are

ManyToOne
Course to User  -Why i choose many to one


OneToOne
Course to pricingComponent
pricingComponent to priceDetails

mysql> select * from user;
+----+------+---------+--------+
| id | age  | name    | region |
+----+------+---------+--------+
|  1 |   26 | prince1 | India  |
|  2 |   26 | prince2 | USA    |
+----+------+---------+--------+

mysql> select * from course;
+----+-------------+-----------+----------------------+---------+
| id | course_name | inspector | pricing_component_id | user_id |
+----+-------------+-----------+----------------------+---------+
|  1 | psc         | ram       |                    1 |       2 |
+----+-------------+-----------+----------------------+---------+


mysql> select * from pricing_component;
+----+-------------+------------------+
| id | course_fees | price_details_id |
+----+-------------+------------------+
|  1 |          50 |                2 |
+----+-------------+------------------+


	price detail
+----+-------------------+-----+-----+-----+
| id | conversion_charge | gst | tax | vat |
+----+-------------------+-----+-----+-----+
|  1 |                 0 |  45 |   5 |  50 |
|  2 |                 0 |  20 |   5 |  50 |
|  3 |                30 |  20 |   5 |  50 |
+----+-------------------+-----+-----+-----+

 
 

