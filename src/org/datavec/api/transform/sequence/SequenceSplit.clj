(ns org.datavec.api.transform.sequence.SequenceSplit
  "SequenceSplit interface: used to split a single sequence into multiple smaller subsequences, according
 to some criteria"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence SequenceSplit]))

(defn split
  "Split a sequence in to multiple time steps

  sequence - the sequence to split - `java.util.List`

  returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^SequenceSplit this ^java.util.List sequence]
    (-> this (.split sequence))))

(defn set-input-schema
  "Sets the input schema for this split

  input-schema - the schema to set - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceSplit this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Getter for the input schema

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceSplit this]
    (-> this (.getInputSchema))))

