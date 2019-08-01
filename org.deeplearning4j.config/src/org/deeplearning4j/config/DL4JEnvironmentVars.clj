(ns org.deeplearning4j.config.DL4JEnvironmentVars
  "DL4JSystemProperties class contains the environment variables that can be used to configure various aspects of DL4J.
 See the javadoc of each variable for details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.config DL4JEnvironmentVars]))

(def *-dl-4-j-void-ip
  "Static Constant.

  Applicability: Module dl4j-spark-parameterserver_2.xx
  Usage: A fallback for determining the local IP for a Spark training worker, if other approaches
  fail to determine the local IP

  type: java.lang.String"
  DL4JEnvironmentVars/DL4J_VOID_IP)

