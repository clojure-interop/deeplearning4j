(ns org.datavec.api.transform.reduce.IAssociativeReducer
  "A reducer aggregates or combines
 a set of examples into
 a single List"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce IAssociativeReducer]))

(defn set-input-schema
  "schema - `org.datavec.api.transform.schema.Schema`"
  ([^IAssociativeReducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^IAssociativeReducer this]
    (-> this (.getInputSchema))))

(defn transform
  "schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^IAssociativeReducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn aggregable-reducer
  "An aggregation that has the property that
  reduce(List(reduce(List(l1, l2)), l3)) = reduce(List(l1, reduce(List(l2, l3)))

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<java.util.List<org.datavec.api.writable.Writable>,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^IAssociativeReducer this]
    (-> this (.aggregableReducer))))

(defn get-key-columns
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^IAssociativeReducer this]
    (-> this (.getKeyColumns))))

