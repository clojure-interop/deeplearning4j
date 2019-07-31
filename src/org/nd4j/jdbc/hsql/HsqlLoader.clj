(ns org.nd4j.jdbc.hsql.HsqlLoader
  "HSQLDB loader for ndarrays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jdbc.hsql HsqlLoader]))

(defn ->hsql-loader
  "Constructor.

  data-source - `javax.sql.DataSource`
  jdbc-url - `java.lang.String`
  table-name - `java.lang.String`
  id-column-name - `java.lang.String`
  column-name - `java.lang.String`

  throws: java.lang.Exception"
  (^HsqlLoader [^javax.sql.DataSource data-source ^java.lang.String jdbc-url ^java.lang.String table-name ^java.lang.String id-column-name ^java.lang.String column-name]
    (new HsqlLoader data-source jdbc-url table-name id-column-name column-name))
  (^HsqlLoader [^java.lang.String jdbc-url ^java.lang.String table-name ^java.lang.String id-column-name ^java.lang.String column-name]
    (new HsqlLoader jdbc-url table-name id-column-name column-name)))

(defn insert-statement
  "Create an insert statement

  returns: a new insert statement - `java.lang.String`"
  (^java.lang.String [^HsqlLoader this]
    (-> this (.insertStatement))))

(defn load-statement
  "Create an insert statement. This should be a templated query.
  IE: Question mark at the end, we will take care of setting the proper value.

  returns: a new insert statement - `java.lang.String`"
  (^java.lang.String [^HsqlLoader this]
    (-> this (.loadStatement))))

(defn delete-statement
  "Create an delete statement

  returns: a new delete statement - `java.lang.String`"
  (^java.lang.String [^HsqlLoader this]
    (-> this (.deleteStatement))))

