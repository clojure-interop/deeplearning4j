(ns org.nd4j.jdbc.mysql.MysqlLoader
  "Mysql loader for ndarrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jdbc.mysql MysqlLoader]))

(defn ->mysql-loader
  "Constructor.

  data-source - `javax.sql.DataSource`
  jdbc-url - `java.lang.String`
  table-name - `java.lang.String`
  column-name - `java.lang.String`

  throws: java.lang.Exception"
  (^MysqlLoader [^javax.sql.DataSource data-source ^java.lang.String jdbc-url ^java.lang.String table-name ^java.lang.String column-name]
    (new MysqlLoader data-source jdbc-url table-name column-name)))

(defn insert-statement
  "Create an insert statement

  returns: a new insert statement - `java.lang.String`"
  (^java.lang.String [^MysqlLoader this]
    (-> this (.insertStatement))))

(defn load-statement
  "Create an insert statement. This should be a templated query.
  IE: Question mark at the end, we will take care of setting the proper value.

  returns: a new insert statement - `java.lang.String`"
  (^java.lang.String [^MysqlLoader this]
    (-> this (.loadStatement))))

(defn delete-statement
  "Create an delete statement

  returns: a new delete statement - `java.lang.String`"
  (^java.lang.String [^MysqlLoader this]
    (-> this (.deleteStatement))))

