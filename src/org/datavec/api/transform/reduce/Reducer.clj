(ns org.datavec.api.transform.reduce.Reducer
  "A Reducer is used to take a set of examples and reduce them.
 The idea: suppose you have a large number of columns, and you want to combine/reduce the values in each column.
 Reducer allows you to specify different reductions for differently for different columns: min, max, sum, mean etc.
 See Reducer.Builder and ReduceOp for the full list.
 Note this supports executing multipe reducitons per column: simply call the Builder with Xcolumn() repeatedly
 on the same column, or use Reducer.Builder.multipleOpColmumns(List, String...)}

 Uses are:
 (1) Reducing examples by a key
 (2) Reduction operations in time series (windowing ops, etc)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce Reducer]))

(defn ->reducer
  "Constructor.

  key-columns - `java.util.List`
  default-op - `org.datavec.api.transform.ReduceOp`
  op-map - `java.util.Map`
  custom-reductions - `java.util.Map`
  conditional-reductions - `java.util.Map`
  ignore-invalid-in-columns - `java.util.Set`"
  (^Reducer [^java.util.List key-columns ^org.datavec.api.transform.ReduceOp default-op ^java.util.Map op-map ^java.util.Map custom-reductions ^java.util.Map conditional-reductions ^java.util.Set ignore-invalid-in-columns]
    (new Reducer key-columns default-op op-map custom-reductions conditional-reductions ignore-invalid-in-columns)))

(defn set-input-schema
  "schema - `org.datavec.api.transform.schema.Schema`"
  ([^Reducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Reducer this]
    (-> this (.getInputSchema))))

(defn get-key-columns
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Reducer this]
    (-> this (.getKeyColumns))))

(defn transform
  "Get the output schema, given the input schema

  schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Reducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn aggregable-reducer
  "Description copied from interface: IAssociativeReducer

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<java.util.List<org.datavec.api.writable.Writable>,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^Reducer this]
    (-> this (.aggregableReducer))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Reducer this]
    (-> this (.toString))))

