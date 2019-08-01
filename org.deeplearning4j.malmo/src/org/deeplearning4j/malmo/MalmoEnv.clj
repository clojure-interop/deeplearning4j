(ns org.deeplearning4j.malmo.MalmoEnv
  "MDP Wrapper around Malmo Java Client Library"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoEnv]))

(defn ->malmo-env
  "Constructor.

  Create a fully specified MalmoEnv

  mission - Malmo mission specification. - `com.microsoft.msr.malmo.MissionSpec`
  mission-record - Malmo record specification. Ignored if set to NULL - `com.microsoft.msr.malmo.MissionRecordSpec`
  action-space - Malmo action space implementation - `org.deeplearning4j.malmo.MalmoActionSpace`
  observation-space - Malmo observation space implementation - `org.deeplearning4j.malmo.MalmoObservationSpace`
  frame-policy - Malmo frame policy implementation - `org.deeplearning4j.malmo.MalmoObservationPolicy`
  client-pool - Malmo client pool; cannot be null - `com.microsoft.msr.malmo.ClientPool`"
  (^MalmoEnv [^com.microsoft.msr.malmo.MissionSpec mission ^com.microsoft.msr.malmo.MissionRecordSpec mission-record ^org.deeplearning4j.malmo.MalmoActionSpace action-space ^org.deeplearning4j.malmo.MalmoObservationSpace observation-space ^org.deeplearning4j.malmo.MalmoObservationPolicy frame-policy ^com.microsoft.msr.malmo.ClientPool client-pool]
    (new MalmoEnv mission mission-record action-space observation-space frame-policy client-pool))
  (^MalmoEnv [^java.lang.String mission-file-name ^org.deeplearning4j.malmo.MalmoActionSpace action-space ^org.deeplearning4j.malmo.MalmoObservationSpace observation-space ^org.deeplearning4j.malmo.MalmoObservationPolicy frame-policy ^java.lang.String client-pool]
    (new MalmoEnv mission-file-name action-space observation-space frame-policy client-pool)))

(defn *load-mission-xml
  "Convenience method to load a Malmo mission specification from an XML-file

  filename - name of XML file - `java.lang.String`

  returns: Mission specification loaded from XML-file - `com.microsoft.msr.malmo.MissionSpec`"
  (^com.microsoft.msr.malmo.MissionSpec [^java.lang.String filename]
    (MalmoEnv/loadMissionXML filename)))

(defn reset
  "returns: `org.deeplearning4j.malmo.MalmoBox`"
  (^org.deeplearning4j.malmo.MalmoBox [^MalmoEnv this]
    (-> this (.reset))))

(defn close
  ""
  ([^MalmoEnv this]
    (-> this (.close))))

(defn step
  "action - `java.lang.Integer`

  returns: `org.deeplearning4j.gym.StepReply<org.deeplearning4j.malmo.MalmoBox>`"
  (^org.deeplearning4j.gym.StepReply [^MalmoEnv this ^java.lang.Integer action]
    (-> this (.step action))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^MalmoEnv this]
    (-> this (.isDone))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.MDP<org.deeplearning4j.malmo.MalmoBox,java.lang.Integer,org.deeplearning4j.rl4j.space.DiscreteSpace>`"
  (^org.deeplearning4j.rl4j.mdp.MDP [^MalmoEnv this]
    (-> this (.newInstance))))

