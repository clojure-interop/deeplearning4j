(ns org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.categorical CategoricalQualityAnalysisState]))

(defn ->categorical-quality-analysis-state
  "Constructor.

  integer-meta-data - `org.datavec.api.transform.metadata.CategoricalMetaData`"
  (^CategoricalQualityAnalysisState [^org.datavec.api.transform.metadata.CategoricalMetaData integer-meta-data]
    (new CategoricalQualityAnalysisState integer-meta-data)))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState [^CategoricalQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState [^CategoricalQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.categorical.CategoricalQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^CategoricalQualityAnalysisState this]
    (-> this (.getColumnQuality))))

