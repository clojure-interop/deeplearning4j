(ns org.deeplearning4j.aws.emr.SparkEMRClient
  "Configuration for a Spark EMR cluster"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.emr SparkEMRClient]))

(defn ->spark-emr-client
  "Constructor."
  (^SparkEMRClient []
    (new SparkEMRClient )))

(defn create-cluster
  "Creates the current cluster"
  ([^SparkEMRClient this]
    (-> this (.createCluster))))

(defn list-active-cluster-names
  "Lists existing active clusters Names

  returns: cluster names - `java.util.List<java.lang.String>`"
  (^java.util.List [^SparkEMRClient this]
    (-> this (.listActiveClusterNames))))

(defn list-active-cluster-ids
  "List existing active cluster IDs

  returns: cluster IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^SparkEMRClient this]
    (-> this (.listActiveClusterIds))))

(defn terminate-cluster
  "Terminates a cluster"
  ([^SparkEMRClient this]
    (-> this (.terminateCluster))))

(defn spark-submit-job-with-main
  "Submit a Spark Job with a specified main class

  args - `java.lang.String[]`
  main-class - `java.lang.String`
  uber-jar - `java.io.File`

  throws: java.lang.Exception"
  ([^SparkEMRClient this args ^java.lang.String main-class ^java.io.File uber-jar]
    (-> this (.sparkSubmitJobWithMain args main-class uber-jar))))

(defn spark-monitor
  "Monitor the cluster and terminates when it times out

  throws: java.lang.InterruptedException"
  ([^SparkEMRClient this]
    (-> this (.sparkMonitor))))

