(ns org.datavec.local.transforms.functions.FlatMapFunctionAdapter
  "A function that returns zero or more output records from each input record.
 Adapter for function interface in order to
 freeze interface changes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions FlatMapFunctionAdapter]))

(defn call
  "t - `T`

  returns: `java.util.List<R>`

  throws: java.lang.Exception"
  (^java.util.List [^FlatMapFunctionAdapter this t]
    (-> this (.call t))))

