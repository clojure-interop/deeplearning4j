(ns org.datavec.api.util.jdbc.JdbcWritableConverter
  "Transform jdbc column data into Writable objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.jdbc JdbcWritableConverter]))

(defn *convert
  "column-value - `java.lang.Object`
  column-type - `int`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^java.lang.Object column-value ^Integer column-type]
    (JdbcWritableConverter/convert column-value column-type)))

