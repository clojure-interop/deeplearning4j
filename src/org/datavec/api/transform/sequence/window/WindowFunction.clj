(ns org.datavec.api.transform.sequence.window.WindowFunction
  "A WindowFunction splits a sequence into a set of
 (possibly overlapping) sub-sequences.
 It is a general-purpose interface that can support
 many different types of
 Typically used for example with a transform such as ReduceSequenceByWindowTransform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.window WindowFunction]))

(defn apply-to-sequence
  "Apply the windowing function to the given sequence

  sequence - the input sequence - `java.util.List`

  returns: the sequence with the window function applied - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^WindowFunction this ^java.util.List sequence]
    (-> this (.applyToSequence sequence))))

(defn set-input-schema
  "schema - `org.datavec.api.transform.schema.Schema`"
  ([^WindowFunction this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^WindowFunction this]
    (-> this (.getInputSchema))))

(defn transform
  "Get the output schema, given the input schema. Typically the output schema is the same as the input schema,
  but not necessarily (for example, if the window function adds columns for the window start/end times)

  input-schema - Schema of the input data - `org.datavec.api.transform.schema.Schema`

  returns: Schema of the output windows - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^WindowFunction this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

