(ns org.datavec.spark.transform.join.FilterAndFlattenJoinedValuesAdapter
  "Doing two things here:
 (a) filter out any unnecessary values, and
 (b) extract the List values from the JoinedValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.join FilterAndFlattenJoinedValuesAdapter]))

(defn ->filter-and-flatten-joined-values-adapter
  "Constructor.

  join-type - `org.datavec.api.transform.join.Join$JoinType`"
  (^FilterAndFlattenJoinedValuesAdapter [^org.datavec.api.transform.join.Join$JoinType join-type]
    (new FilterAndFlattenJoinedValuesAdapter join-type)))

(defn call
  "joined-value - `org.datavec.spark.transform.join.JoinedValue`

  returns: `java.lang.Iterable<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^FilterAndFlattenJoinedValuesAdapter this ^org.datavec.spark.transform.join.JoinedValue joined-value]
    (-> this (.call joined-value))))

