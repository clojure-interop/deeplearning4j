(ns org.datavec.api.transform.join.Join$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.join Join$Builder]))

(defn ->builder
  "Constructor.

  type - `org.datavec.api.transform.join.Join$JoinType`"
  (^Join$Builder [^org.datavec.api.transform.join.Join$JoinType type]
    (new Join$Builder type)))

(defn set-schemas
  "left - `org.datavec.api.transform.schema.Schema`
  right - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^org.datavec.api.transform.schema.Schema left ^org.datavec.api.transform.schema.Schema right]
    (-> this (.setSchemas left right))))

(defn set-key-columns
  "Deprecated. Use setJoinColumns(String...)

  key-column-names - `java.lang.String`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^java.lang.String key-column-names]
    (-> this (.setKeyColumns key-column-names))))

(defn set-key-columns-left
  "Deprecated. Use setJoinColumnsLeft(String...)

  key-column-names - `java.lang.String`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^java.lang.String key-column-names]
    (-> this (.setKeyColumnsLeft key-column-names))))

(defn set-key-columns-right
  "Deprecated. Use setJoinColumnsRight(String...)

  key-column-names - `java.lang.String`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^java.lang.String key-column-names]
    (-> this (.setKeyColumnsRight key-column-names))))

(defn set-join-columns
  "Specify the column(s) to join on.
  Here, we are assuming that both data sources have the same column names. If this is not the case,
  use setJoinColumnsLeft(String...) and setJoinColumnsRight(String...).
  The idea: join examples where firstDataValues(joinColumNames[i]) == secondDataValues(joinColumnNames[i]) for all i

  join-column-names - Name of the columns to use as the key to join on - `java.lang.String`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^java.lang.String join-column-names]
    (-> this (.setJoinColumns join-column-names))))

(defn set-join-columns-left
  "Specify the names of the columns to join on, for the left data)
  The idea: join examples where firstDataValues(joinColumNamesLeft[i]) == secondDataValues(joinColumnNamesRight[i]) for all i

  join-column-names - Names of the columns to join on (for left data) - `java.lang.String`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^java.lang.String join-column-names]
    (-> this (.setJoinColumnsLeft join-column-names))))

(defn set-join-columns-right
  "Specify the names of the columns to join on, for the right data)
  The idea: join examples where firstDataValues(joinColumNamesLeft[i]) == secondDataValues(joinColumnNamesRight[i]) for all i

  join-column-names - Names of the columns to join on (for left data) - `java.lang.String`

  returns: `org.datavec.api.transform.join.Join$Builder`"
  (^org.datavec.api.transform.join.Join$Builder [^Join$Builder this ^java.lang.String join-column-names]
    (-> this (.setJoinColumnsRight join-column-names))))

(defn build
  "returns: `org.datavec.api.transform.join.Join`"
  (^org.datavec.api.transform.join.Join [^Join$Builder this]
    (-> this (.build))))

