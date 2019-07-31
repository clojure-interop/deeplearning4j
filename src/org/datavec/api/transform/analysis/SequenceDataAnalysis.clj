(ns org.datavec.api.transform.analysis.SequenceDataAnalysis
  "Created by Alex on 12/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis SequenceDataAnalysis]))

(defn ->sequence-data-analysis
  "Constructor.

  schema - `org.datavec.api.transform.schema.Schema`
  column-analysis - `java.util.List`
  sequence-analysis - `org.datavec.api.transform.analysis.sequence.SequenceLengthAnalysis`"
  (^SequenceDataAnalysis [^org.datavec.api.transform.schema.Schema schema ^java.util.List column-analysis ^org.datavec.api.transform.analysis.sequence.SequenceLengthAnalysis sequence-analysis]
    (new SequenceDataAnalysis schema column-analysis sequence-analysis)))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.datavec.api.transform.analysis.SequenceDataAnalysis`"
  (^org.datavec.api.transform.analysis.SequenceDataAnalysis [^java.lang.String json]
    (SequenceDataAnalysis/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.datavec.api.transform.analysis.SequenceDataAnalysis`"
  (^org.datavec.api.transform.analysis.SequenceDataAnalysis [^java.lang.String yaml]
    (SequenceDataAnalysis/fromYaml yaml)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceDataAnalysis this]
    (-> this (.toString))))

