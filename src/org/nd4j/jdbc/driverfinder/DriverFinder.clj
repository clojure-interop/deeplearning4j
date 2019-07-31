(ns org.nd4j.jdbc.driverfinder.DriverFinder
  "JDBC Driver finder"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jdbc.driverfinder DriverFinder]))

(defn ->driver-finder
  "Constructor."
  (^DriverFinder []
    (new DriverFinder )))

(def *-nd-4j-jdbc-properties
  "Static Constant.

  type: java.lang.String"
  DriverFinder/ND4j_JDBC_PROPERTIES)

(def *-jdbc-key
  "Static Constant.

  type: java.lang.String"
  DriverFinder/JDBC_KEY)

(defn *get-driver
  "returns: `java.sql.Driver`"
  (^java.sql.Driver []
    (DriverFinder/getDriver )))

