(ns org.datavec.api.transform.metadata.BaseColumnMetaData
  "Created by Alex on 18/07/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata BaseColumnMetaData]))

(defn get-name
  "Description copied from interface: ColumnMetaData

  returns: Name of the column - `java.lang.String`"
  (^java.lang.String [^BaseColumnMetaData this]
    (-> this (.getName))))

(defn set-name
  "Description copied from interface: ColumnMetaData

  name - `java.lang.String`"
  ([^BaseColumnMetaData this ^java.lang.String name]
    (-> this (.setName name))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^BaseColumnMetaData this]
    (-> this (.clone))))

