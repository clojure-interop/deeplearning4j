(ns org.nd4j.linalg.indexing.conditions.ConditionBuilder
  "Mini dsl for building conditions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.conditions ConditionBuilder]))

(defn ->condition-builder
  "Constructor."
  (^ConditionBuilder []
    (new ConditionBuilder )))

(defn or
  "conditions - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.indexing.conditions.ConditionBuilder`"
  (^org.nd4j.linalg.indexing.conditions.ConditionBuilder [^ConditionBuilder this ^org.nd4j.linalg.indexing.conditions.Condition conditions]
    (-> this (.or conditions))))

(defn and
  "conditions - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.indexing.conditions.ConditionBuilder`"
  (^org.nd4j.linalg.indexing.conditions.ConditionBuilder [^ConditionBuilder this ^org.nd4j.linalg.indexing.conditions.Condition conditions]
    (-> this (.and conditions))))

(defn eq
  "conditions - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.indexing.conditions.ConditionBuilder`"
  (^org.nd4j.linalg.indexing.conditions.ConditionBuilder [^ConditionBuilder this ^org.nd4j.linalg.indexing.conditions.Condition conditions]
    (-> this (.eq conditions))))

(defn not
  "returns: `org.nd4j.linalg.indexing.conditions.ConditionBuilder`"
  (^org.nd4j.linalg.indexing.conditions.ConditionBuilder [^ConditionBuilder this]
    (-> this (.not))))

(defn build
  "returns: `org.nd4j.linalg.indexing.conditions.Condition`"
  (^org.nd4j.linalg.indexing.conditions.Condition [^ConditionBuilder this]
    (-> this (.build))))

