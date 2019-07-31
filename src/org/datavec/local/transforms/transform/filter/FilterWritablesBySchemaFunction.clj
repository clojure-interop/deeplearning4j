(ns org.datavec.local.transforms.transform.filter.FilterWritablesBySchemaFunction
  "Created by Alex on 6/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.transform.filter FilterWritablesBySchemaFunction]))

(defn ->filter-writables-by-schema-function
  "Constructor.

  meta - Column meta data - `org.datavec.api.transform.metadata.ColumnMetaData`
  keep-valid - If true: keep only the valid writables. If false: keep only the invalid writables - `boolean`
  exclude-missing - If true: don't return any missing values, regardless of keepValid setting (i.e., exclude any NullWritable or empty string values) - `boolean`"
  (^FilterWritablesBySchemaFunction [^org.datavec.api.transform.metadata.ColumnMetaData meta ^Boolean keep-valid ^Boolean exclude-missing]
    (new FilterWritablesBySchemaFunction meta keep-valid exclude-missing))
  (^FilterWritablesBySchemaFunction [^org.datavec.api.transform.metadata.ColumnMetaData meta ^Boolean keep-valid]
    (new FilterWritablesBySchemaFunction meta keep-valid)))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `org.datavec.api.writable.Writable`

  returns: Result - `java.lang.Boolean`"
  (^java.lang.Boolean [^FilterWritablesBySchemaFunction this ^org.datavec.api.writable.Writable v-1]
    (-> this (.apply v-1))))

