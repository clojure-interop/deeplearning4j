(ns org.datavec.local.transforms.join.FilterAndFlattenJoinedValues
  "Doing two things here:
 (a) filter out any unnecessary values, and
 (b) extract the List values from the JoinedValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.join FilterAndFlattenJoinedValues]))

(defn ->filter-and-flatten-joined-values
  "Constructor.

  join-type - `org.datavec.api.transform.join.Join$JoinType`"
  (^FilterAndFlattenJoinedValues [^org.datavec.api.transform.join.Join$JoinType join-type]
    (new FilterAndFlattenJoinedValues join-type)))

