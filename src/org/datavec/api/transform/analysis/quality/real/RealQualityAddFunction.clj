(ns org.datavec.api.transform.analysis.quality.real.RealQualityAddFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.real RealQualityAddFunction]))

(defn ->real-quality-add-function
  "Constructor."
  (^RealQualityAddFunction []
    (new RealQualityAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.DoubleQuality`
  writable - Second argument - `org.datavec.api.writable.Writable`

  returns: Result - `org.datavec.api.transform.quality.columns.DoubleQuality`"
  (^org.datavec.api.transform.quality.columns.DoubleQuality [^RealQualityAddFunction this ^org.datavec.api.transform.quality.columns.DoubleQuality v-1 ^org.datavec.api.writable.Writable writable]
    (-> this (.apply v-1 writable))))

