(ns org.datavec.local.transforms.join.FilterAndFlattenJoinedValuesAdapter
  "Doing two things here:
 (a) filter out any unnecessary values, and
 (b) extract the List values from the JoinedValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.join FilterAndFlattenJoinedValuesAdapter]))

(defn ->filter-and-flatten-joined-values-adapter
  "Constructor.

  join-type - `org.datavec.api.transform.join.Join$JoinType`"
  (^FilterAndFlattenJoinedValuesAdapter [^org.datavec.api.transform.join.Join$JoinType join-type]
    (new FilterAndFlattenJoinedValuesAdapter join-type)))

(defn call
  "joined-value - `org.datavec.local.transforms.join.JoinedValue`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^FilterAndFlattenJoinedValuesAdapter this ^org.datavec.local.transforms.join.JoinedValue joined-value]
    (-> this (.call joined-value))))

