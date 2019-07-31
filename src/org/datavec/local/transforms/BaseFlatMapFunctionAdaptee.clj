(ns org.datavec.local.transforms.BaseFlatMapFunctionAdaptee
  "This class should be used instead of direct referral to FlatMapFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms BaseFlatMapFunctionAdaptee]))

(defn ->base-flat-map-function-adaptee
  "Constructor.

  adapter - `org.datavec.local.transforms.functions.FlatMapFunctionAdapter`"
  (^BaseFlatMapFunctionAdaptee [^org.datavec.local.transforms.functions.FlatMapFunctionAdapter adapter]
    (new BaseFlatMapFunctionAdaptee adapter)))

(defn call
  "k - `K`

  returns: `java.util.List<V>`"
  (^java.util.List [^BaseFlatMapFunctionAdaptee this k]
    (-> this (.call k))))

