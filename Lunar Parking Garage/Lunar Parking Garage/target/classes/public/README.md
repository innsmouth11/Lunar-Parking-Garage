
CREATE TABLE customer
(
  identificationnumber serial NOT NULL,
  emailaddress character varying(255),
  firstname character varying(255),
  lastname character varying(255),
  phonenumber character varying(255),
  CONSTRAINT identificationnumber PRIMARY KEY (identificationnumber)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE customer
  OWNER TO postgres;
  

  
 CREATE TABLE vehicle
(
  videntificationnumber serial NOT NULL,
  make character varying,
  model character varying,
  color character varying,
  location character varying,
  licenseplatenumber character varying,
  CONSTRAINT videntificationnumber PRIMARY KEY (videntificationnumber)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE vehicle
  OWNER TO postgres;
  
  
  CREATE TABLE monthlypass
(
  monthlypassid serial NOT NULL,
  expirationdate character varying(255),
  customer integer,
  vehicle integer,
  price integer,
  CONSTRAINT monthlypassid PRIMARY KEY (monthlypassid),
  CONSTRAINT customer_fk FOREIGN KEY (customer)
      REFERENCES customer (identificationnumber) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT vehicle_fk FOREIGN KEY (vehicle)
      REFERENCES vehicle (videntificationnumber) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE monthlypass
  OWNER TO postgres;

-- Index: fki_customer_fk

-- DROP INDEX fki_customer_fk;

CREATE INDEX fki_customer_fk
  ON monthlypass
  USING btree
  (customer);

-- Index: fki_vehicle_fk

-- DROP INDEX fki_vehicle_fk;

CREATE INDEX fki_vehicle_fk
  ON monthlypass
  USING btree
  (vehicle);
  



INSERT INTO customer (emailaddress, firstname, lastname, phonenumber)
VALUES ('winner@winning.com', 'Charlie', 'Sheen', '912-444-5653');

INSERT INTO customer (emailaddress, firstname, lastname, phonenumber)
VALUES ('magicisreallyreal@blaine.com', 'David', 'Blaine', '465-102-1533');

INSERT INTO customer (emailaddress, firstname, lastname, phonenumber)
VALUES ('sdfsDppggg@aol.com', 'Gary', 'Busey', 'none');

INSERT INTO customer (emailaddress, firstname, lastname, phonenumber)
VALUES ('notgonnahurtya@australia.com', 'Steve', 'Irwin', '+61 412 233 210');

INSERT INTO customer (emailaddress, firstname, lastname, phonenumber)
VALUES ('goodvoice319@comcast.net', 'Mariah', 'Carey', '287-789-1257');


INSERT INTO vehicle (make, model, color, location, licenseplatenumber)
VALUES ('Ford', 'Taurus', 'Beige', 'Fargo, North Dakota', 'DFG-091');

INSERT INTO vehicle (make, model, color, location, licenseplatenumber)
VALUES ('Rolls-Royce', 'Wraith', 'Yellow', 'Harlem, New York', 'camelCase');

INSERT INTO vehicle (make, model, color, location, licenseplatenumber)
VALUES ('Toyota', 'Highlander', 'Red', 'Seattle, Washington', 'ARFG-287');

INSERT INTO vehicle (make, model, color, location, licenseplatenumber)
VALUES ('Honda', 'Civic', 'White', 'Tokyo, Japan', 'ZDSEF-192112');

INSERT INTO vehicle (make, model, color, location, licenseplatenumber)
VALUES ('Saab', '9000', 'Chrome', 'Oslo, Norway', 'drvSfe');


INSERT INTO monthlypass (expirationdate, customer, vehicle, price)
VALUES ('11/11/3012', 1, 2, 50.50);

INSERT INTO monthlypass (expirationdate, customer, vehicle, price)
VALUES ('04/08/1052', 2, 3, 75);

INSERT INTO monthlypass (expirationdate, customer, vehicle, price)
VALUES ('05/14/2051', 3, 4, 75);

INSERT INTO monthlypass (expirationdate, customer, vehicle, price)
VALUES ('09/07/1978', 4, 5, 100);

INSERT INTO monthlypass (expirationdate, customer, vehicle, price)
VALUES ('06/16/2016', 5, 1, 25);