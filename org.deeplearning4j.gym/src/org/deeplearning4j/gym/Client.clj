(ns org.deeplearning4j.gym.Client
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.gym Client]))

(defn ->client
  "Constructor."
  (^Client []
    (new Client )))

(defn *-v-1-root
  "Static Field.

  type: java.lang.String"
  []
  Client/V1_ROOT)

(defn *-envs-root
  "Static Field.

  type: java.lang.String"
  []
  Client/ENVS_ROOT)

(defn *-monitor-start
  "Static Field.

  type: java.lang.String"
  []
  Client/MONITOR_START)

(defn *-monitor-close
  "Static Field.

  type: java.lang.String"
  []
  Client/MONITOR_CLOSE)

(defn *-close
  "Static Field.

  type: java.lang.String"
  []
  Client/CLOSE)

(defn *-reset
  "Static Field.

  type: java.lang.String"
  []
  Client/RESET)

(defn *-shutdown
  "Static Field.

  type: java.lang.String"
  []
  Client/SHUTDOWN)

(defn *-upload
  "Static Field.

  type: java.lang.String"
  []
  Client/UPLOAD)

(defn *-step
  "Static Field.

  type: java.lang.String"
  []
  Client/STEP)

(defn *-observation-space
  "Static Field.

  type: java.lang.String"
  []
  Client/OBSERVATION_SPACE)

(defn *-action-space
  "Static Field.

  type: java.lang.String"
  []
  Client/ACTION_SPACE)

(defn *list-all
  "url - url of the server - `java.lang.String`

  returns: set of all environments running on the server at the url - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^java.lang.String url]
    (Client/listAll url)))

(defn *server-shutdown
  "Shutdown the server at the url

  url - url of the server - `java.lang.String`"
  ([^java.lang.String url]
    (Client/serverShutdown url)))

(defn list-all
  "returns: set of all environments running on the same server than this client - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^Client this]
    (-> this (.listAll))))

(defn step
  "Step the environment by one action

  action - action to step the environment with - `A`

  returns: the StepReply containing the next observation, the reward, if it is a terminal state and optional information. - `org.deeplearning4j.gym.StepReply<O>`"
  (^org.deeplearning4j.gym.StepReply [^Client this action]
    (-> this (.step action))))

(defn reset
  "Reset the state of the environment and return an initial observation.

  returns: initial observation - `O`"
  ([^Client this]
    (-> this (.reset))))

(defn monitor-start
  "Start monitoring.

  directory - path to directory in which store the monitoring file - `java.lang.String`
  force - clear out existing training data from this directory (by deleting every file prefixed with \"openaigym.\") - `boolean`
  resume - retain the training data already in this directory, which will be merged with our new data - `boolean`"
  ([^Client this ^java.lang.String directory ^Boolean force ^Boolean resume]
    (-> this (.monitorStart directory force resume))))

(defn monitor-close
  "Flush all monitor data to disk"
  ([^Client this]
    (-> this (.monitorClose))))

(defn upload
  "Upload monitoring data to OpenAI servers.

  training-dir - directory that contains the monitoring data - `java.lang.String`
  api-key - personal OpenAI API key - `java.lang.String`
  algorithm-id - an arbitrary string indicating the paricular version of the algorithm (including choices of parameters) you are running. - `java.lang.String`"
  ([^Client this ^java.lang.String training-dir ^java.lang.String api-key ^java.lang.String algorithm-id]
    (-> this (.upload training-dir api-key algorithm-id)))
  ([^Client this ^java.lang.String training-dir ^java.lang.String api-key]
    (-> this (.upload training-dir api-key))))

(defn server-shutdown
  "Shutdown the server at the same url than this client"
  ([^Client this]
    (-> this (.serverShutdown))))

(defn get-action-space
  "returns: `org.deeplearning4j.rl4j.space.ActionSpace`"
  (^org.deeplearning4j.rl4j.space.ActionSpace [^Client this]
    (-> this (.getActionSpace))))

