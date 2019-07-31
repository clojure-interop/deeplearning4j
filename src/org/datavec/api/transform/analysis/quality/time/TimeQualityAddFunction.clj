(ns org.datavec.api.transform.analysis.quality.time.TimeQualityAddFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.time TimeQualityAddFunction]))

(defn ->time-quality-add-function
  "Constructor."
  (^TimeQualityAddFunction []
    (new TimeQualityAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.TimeQuality`
  writable - Second argument - `org.datavec.api.writable.Writable`

  returns: Result - `org.datavec.api.transform.quality.columns.TimeQuality`"
  (^org.datavec.api.transform.quality.columns.TimeQuality [^TimeQualityAddFunction this ^org.datavec.api.transform.quality.columns.TimeQuality v-1 ^org.datavec.api.writable.Writable writable]
    (-> this (.apply v-1 writable))))

