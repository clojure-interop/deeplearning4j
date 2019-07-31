(ns org.datavec.api.transform.stringreduce.StringReducer
  "A StringReducer is used to take a set of examples and reduce them.
 The idea: suppose you have a large number of columns, and you want to combine/reduce the values in each column.
 StringReducer allows you to specify different reductions for differently for different columns: min, max, sum, mean etc.
 See StringReducer.Builder and ReduceOp for the full list.

 Uses are:
 (1) Reducing examples by a key
 (2) Reduction operations in time series (windowing ops, etc)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.stringreduce StringReducer]))

(defn ->string-reducer
  "Constructor.

  input-columns - `java.util.List`
  string-reduce-op - `org.datavec.api.transform.StringReduceOp`
  custom-reductions - `java.util.Map`
  output-column-name - `java.lang.String`"
  (^StringReducer [^java.util.List input-columns ^org.datavec.api.transform.StringReduceOp string-reduce-op ^java.util.Map custom-reductions ^java.lang.String output-column-name]
    (new StringReducer input-columns string-reduce-op custom-reductions output-column-name)))

(defn *reduce-string-or-categorical-column
  "op - `org.datavec.api.transform.StringReduceOp`
  values - `java.util.List`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^org.datavec.api.transform.StringReduceOp op ^java.util.List values]
    (StringReducer/reduceStringOrCategoricalColumn op values)))

(defn set-input-schema
  "schema - `org.datavec.api.transform.schema.Schema`"
  ([^StringReducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^StringReducer this]
    (-> this (.getInputSchema))))

(defn get-input-columns
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^StringReducer this]
    (-> this (.getInputColumns))))

(defn transform
  "Get the output schema, given the input schema

  schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^StringReducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn reduce
  "examples-list - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^StringReducer this ^java.util.List examples-list]
    (-> this (.reduce examples-list))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringReducer this]
    (-> this (.toString))))

