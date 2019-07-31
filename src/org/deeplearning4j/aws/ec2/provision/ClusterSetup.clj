(ns org.deeplearning4j.aws.ec2.provision.ClusterSetup
  "Sets up a DL4J cluster"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.ec2.provision ClusterSetup]))

(defn ->cluster-setup
  "Constructor.

  args - `java.lang.String[]`"
  (^ClusterSetup [args]
    (new ClusterSetup args)))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (ClusterSetup/main args)))

(defn exec
  ""
  ([^ClusterSetup this]
    (-> this (.exec))))

