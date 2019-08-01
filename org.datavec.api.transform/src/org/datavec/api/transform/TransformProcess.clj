(ns org.datavec.api.transform.TransformProcess
  "A TransformProcess defines
 an ordered list of transformations
 to be executed on some data"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform TransformProcess]))

(defn ->transform-process
  "Constructor.

  initial-schema - `org.datavec.api.transform.schema.Schema`
  action-list - `java.util.List`"
  (^TransformProcess [^org.datavec.api.transform.schema.Schema initial-schema ^java.util.List action-list]
    (new TransformProcess initial-schema action-list)))

(defn *from-json
  "Deserialize a JSON String (created by toJson()) to a TransformProcess

  json - `java.lang.String`

  returns: TransformProcess, from JSON - `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^java.lang.String json]
    (TransformProcess/fromJson json)))

(defn *from-yaml
  "Deserialize a JSON String (created by toJson()) to a TransformProcess

  yaml - `java.lang.String`

  returns: TransformProcess, from JSON - `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^java.lang.String yaml]
    (TransformProcess/fromYaml yaml)))

(defn *infer-categories
  "Infer the categories for the given record reader for a particular column
  Note that each \"column index\" is a column in the context of:
  List record = ...;
  record.get(columnIndex);
  Note that anything passed in as a column will be automatically converted to a
  string for categorical purposes.
  The *expected* input is strings or numbers (which have sensible toString() representations)
  Note that the returned categories will be sorted alphabetically

  record-reader - the record reader to iterate through - `org.datavec.api.records.reader.RecordReader`
  column-index - te column index to get categories for - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^org.datavec.api.records.reader.RecordReader record-reader ^Integer column-index]
    (TransformProcess/inferCategories record-reader column-index)))

(defn execute-sequence
  "Execute the full sequence of transformations for a single time series (sequence). May return null if example is filtered

  input-sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^TransformProcess this ^java.util.List input-sequence]
    (-> this (.executeSequence input-sequence))))

(defn transform-raw-strings-to-input
  "Based on the input schema,
  map raw string values to the appropriate
  writable

  values - the values to convert - `java.lang.String`

  returns: the transformed values based on the schema - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^TransformProcess this ^java.lang.String values]
    (-> this (.transformRawStringsToInput values))))

(defn execute-to-sequence-batch
  "Execute a TransformProcess that starts with a single (non-sequence) record,
  and converts it to a sequence record.
  NOTE: This method has the following significant limitation:
  if it contains a ConvertToSequence op,
  it MUST be using singleStepSequencesMode - see ConvertToSequence for details.
  This restriction is necessary, as ConvertToSequence.singleStepSequencesMode is false, this requires a group by
  operation - i.e., we need to group multiple independent records together by key(s) - this isn't possible here,
  when providing a single example as input

  input-example - Input example - `java.util.List`

  returns: Sequence, after processing (or null, if it was filtered out) - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^TransformProcess this ^java.util.List input-example]
    (-> this (.executeToSequenceBatch input-example))))

(defn execute-sequence-to-sequence
  "input - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^TransformProcess this ^java.util.List input]
    (-> this (.executeSequenceToSequence input))))

(defn execute-to-sequence
  "Execute a TransformProcess that starts with a single (non-sequence) record,
  and converts it to a sequence record.
  NOTE: This method has the following significant limitation:
  if it contains a ConvertToSequence op,
  it MUST be using singleStepSequencesMode - see ConvertToSequence for details.
  This restriction is necessary, as ConvertToSequence.singleStepSequencesMode is false, this requires a group by
  operation - i.e., we need to group multiple independent records together by key(s) - this isn't possible here,
  when providing a single example as input

  input-example - Input example - `java.util.List`

  returns: Sequence, after processing (or null, if it was filtered out) - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^TransformProcess this ^java.util.List input-example]
    (-> this (.executeToSequence input-example))))

(defn get-schema-after-step
  "Return the schema after executing all steps up to and including the specified step.
  Steps are indexed from 0: so getSchemaAfterStep(0) is after one transform has been executed.

  step - Index of the step - `int`

  returns: Schema of the data, after that (and all prior) steps have been executed - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^TransformProcess this ^Integer step]
    (-> this (.getSchemaAfterStep step))))

(defn execute-sequence-to-single
  "Execute a TransformProcess that starts with a sequence
  record, and converts it to a single (non-sequence) record

  input-sequence - Input sequence - `java.util.List`

  returns: Record after processing (or null if filtered out) - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^TransformProcess this ^java.util.List input-sequence]
    (-> this (.executeSequenceToSingle input-sequence))))

(defn to-yaml
  "Convert the TransformProcess to a YAML string

  returns: TransformProcess, as YAML - `java.lang.String`"
  (^java.lang.String [^TransformProcess this]
    (-> this (.toYaml))))

(defn transform-raw-strings-to-input-sequence
  "Transforms a sequence
  of strings in to a sequence of writables
  (very similar to transformRawStringsToInput(String...)
  for sequences

  sequence - the sequence to transform - `java.util.List`

  returns: the transformed input - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^TransformProcess this ^java.util.List sequence]
    (-> this (.transformRawStringsToInputSequence sequence))))

(defn get-final-schema
  "Get the Schema of the output data, after executing the process

  returns: Schema of the output data - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^TransformProcess this]
    (-> this (.getFinalSchema))))

(defn to-json
  "Convert the TransformProcess to a JSON string

  returns: TransformProcess, as JSON - `java.lang.String`"
  (^java.lang.String [^TransformProcess this]
    (-> this (.toJson))))

(defn execute
  "Execute the full sequence of transformations for a single example. May return null if example is filtered
  NOTE: Some TransformProcess operations cannot be done on examples individually. Most notably, ConvertToSequence
  and ConvertFromSequence operations require the full data set to be processed at once

  input - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^TransformProcess this ^java.util.List input]
    (-> this (.execute input))))

(defn transform-raw-strings-to-input-list
  "Based on the input schema,
  map raw string values to the appropriate
  writable

  values - the values to convert - `java.util.List`

  returns: the transformed values based on the schema - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^TransformProcess this ^java.util.List values]
    (-> this (.transformRawStringsToInputList values))))

(defn get-action-list
  "Get the action list that this transform process
  will execute

  returns: `java.util.List<org.datavec.api.transform.DataAction>`"
  (^java.util.List [^TransformProcess this]
    (-> this (.getActionList))))

