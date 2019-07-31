(ns org.datavec.spark.transform.filter.FilterWritablesBySchemaFunction
  "Created by Alex on 6/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.filter FilterWritablesBySchemaFunction]))

(defn ->filter-writables-by-schema-function
  "Constructor.

  meta - Column meta data - `org.datavec.api.transform.metadata.ColumnMetaData`
  keep-valid - If true: keep only the valid writables. If false: keep only the invalid writables - `boolean`
  exclude-missing - If true: don't return any missing values, regardless of keepValid setting (i.e., exclude any NullWritable or empty string values) - `boolean`"
  (^FilterWritablesBySchemaFunction [^org.datavec.api.transform.metadata.ColumnMetaData meta ^Boolean keep-valid ^Boolean exclude-missing]
    (new FilterWritablesBySchemaFunction meta keep-valid exclude-missing))
  (^FilterWritablesBySchemaFunction [^org.datavec.api.transform.metadata.ColumnMetaData meta ^Boolean keep-valid]
    (new FilterWritablesBySchemaFunction meta keep-valid)))

(defn call
  "v-1 - `org.datavec.api.writable.Writable`

  returns: `java.lang.Boolean`

  throws: java.lang.Exception"
  (^java.lang.Boolean [^FilterWritablesBySchemaFunction this ^org.datavec.api.writable.Writable v-1]
    (-> this (.call v-1))))

