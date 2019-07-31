(ns org.datavec.api.transform.analysis.quality.real.RealQualityMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.real RealQualityMergeFunction]))

(defn ->real-quality-merge-function
  "Constructor."
  (^RealQualityMergeFunction []
    (new RealQualityMergeFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.DoubleQuality`
  v-2 - Second argument - `org.datavec.api.transform.quality.columns.DoubleQuality`

  returns: Result - `org.datavec.api.transform.quality.columns.DoubleQuality`"
  (^org.datavec.api.transform.quality.columns.DoubleQuality [^RealQualityMergeFunction this ^org.datavec.api.transform.quality.columns.DoubleQuality v-1 ^org.datavec.api.transform.quality.columns.DoubleQuality v-2]
    (-> this (.apply v-1 v-2))))

