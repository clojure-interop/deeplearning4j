(ns org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.categorical CategoricalQualityMergeFunction]))

(defn ->categorical-quality-merge-function
  "Constructor."
  (^CategoricalQualityMergeFunction []
    (new CategoricalQualityMergeFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.CategoricalQuality`
  v-2 - Second argument - `org.datavec.api.transform.quality.columns.CategoricalQuality`

  returns: Result - `org.datavec.api.transform.quality.columns.CategoricalQuality`"
  (^org.datavec.api.transform.quality.columns.CategoricalQuality [^CategoricalQualityMergeFunction this ^org.datavec.api.transform.quality.columns.CategoricalQuality v-1 ^org.datavec.api.transform.quality.columns.CategoricalQuality v-2]
    (-> this (.apply v-1 v-2))))

