(ns org.deeplearning4j.clustering.info.ClusterInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.info ClusterInfo]))

(defn ->cluster-info
  "Constructor.

  thread-safe - `boolean`
  inverse - `boolean`"
  (^ClusterInfo [^Boolean thread-safe ^Boolean inverse]
    (new ClusterInfo thread-safe inverse))
  (^ClusterInfo [^Boolean inverse]
    (new ClusterInfo inverse)))

(defn get-sorted-point-distances-from-center
  "returns: `java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Double>>`"
  (^java.util.Set [^ClusterInfo this]
    (-> this (.getSortedPointDistancesFromCenter))))

(defn get-reverse-sorted-point-distances-from-center
  "returns: `java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Double>>`"
  (^java.util.Set [^ClusterInfo this]
    (-> this (.getReverseSortedPointDistancesFromCenter))))

(defn get-points-farther-from-center-than
  "max-distance - `double`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ClusterInfo this ^Double max-distance]
    (-> this (.getPointsFartherFromCenterThan max-distance))))

