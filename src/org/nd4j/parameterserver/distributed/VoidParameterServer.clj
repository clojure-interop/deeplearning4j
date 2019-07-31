(ns org.nd4j.parameterserver.distributed.VoidParameterServer
  "This is \"special case\" distributed P2P parameter server implementation, suitable for Spark Word2Vec/ParagraphVectors/DeepWalk implementations.
 Aeron is used as backbone for messaging system here.
 Highlights:
  a) It does ONLY one-way messaging. Clients are NOT getting anything back from ParamServer.
 b) It works sharded. Amount of shards is defined in runtime.
 c) Data replication strategy is defined in runtime.
 d) It's supposed to be used as singleton in Spark environment ONLY."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed VoidParameterServer]))

(defn *get-instance
  "returns: `org.nd4j.parameterserver.distributed.VoidParameterServer`"
  (^org.nd4j.parameterserver.distributed.VoidParameterServer []
    (VoidParameterServer/getInstance )))

(defn *get-local-addresses
  "This method returns set of local IP addresses available in system.
  PLEASE NOTE: loopback, disabled interfaces, IPv6 addresses are ignored here.

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (VoidParameterServer/getLocalAddresses )))

(defn exec-distributed-immediately
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`"
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.execDistributedImmediately message))))

(defn set-training-driver
  "trainer - `org.nd4j.parameterserver.distributed.training.TrainingDriver`"
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.training.TrainingDriver trainer]
    (-> this (.setTrainingDriver trainer))))

(defn get-vector
  "This method returns INDArray matching requested storageId value
  PLEASE NOTE: This method IS blocking

  key - `java.lang.Integer`
  row-idx - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VoidParameterServer this ^java.lang.Integer key ^Integer row-idx]
    (-> this (.getVector key row-idx)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^VoidParameterServer this ^Integer row-idx]
    (-> this (.getVector row-idx))))

(defn init?
  "This method returns True if initialization was started AND was finished, false otherwise

  returns: `boolean`"
  (^Boolean [^VoidParameterServer this]
    (-> this (.isInit))))

(defn exec-distributed
  "This method dispatches TrainingMessage to ParameterServer network
  PLEASE NOTE: This method is synchronized and *periodically* becomes blocking by design

  message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`"
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.execDistributed message))))

(defn shutdown
  "This method initiates shutdown sequence for this instance.
  PLEASE NOTE: This method is blocking for first caller only"
  ([^VoidParameterServer this]
    (-> this (.shutdown))))

(defn get-shard-index
  "This method returns shardIndex value.
  If current node is Shard - it reutrns it's value
  If current node is client - it returns Shard index of paired Shard

  returns: `short`"
  (^Short [^VoidParameterServer this]
    (-> this (.getShardIndex))))

(defn init
  "This method starts ParameterServer instance
  PLEASE NOTE: This method is blocking for first caller only

  void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  trainer - `org.nd4j.parameterserver.distributed.training.TrainingDriver`"
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.training.TrainingDriver trainer]
    (-> this (.init void-configuration transport trainer))))

(defn send-message-to-all-clients
  "This method sends given message to all Clients, excluding

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`
  exclusions - `java.lang.Long`"
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message ^java.lang.Long exclusions]
    (-> this (.sendMessageToAllClients message exclusions)))
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageToAllClients message))))

(defn initialize-seq-vec
  "This method handles Shards initialization
  PLEASE NOTE: This method is blocking

  vector-length - `int`
  num-words - `int`
  seed - `long`
  columns-per-shard - `int`
  use-hs - `boolean`
  use-neg-sampling - `boolean`"
  ([^VoidParameterServer this ^Integer vector-length ^Integer num-words ^Long seed ^Integer columns-per-shard ^Boolean use-hs ^Boolean use-neg-sampling]
    (-> this (.initializeSeqVec vector-length num-words seed columns-per-shard use-hs use-neg-sampling))))

(defn send-message-to-all-shards
  "This method sends given message to all Shards

  message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^VoidParameterServer this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.sendMessageToAllShards message))))

