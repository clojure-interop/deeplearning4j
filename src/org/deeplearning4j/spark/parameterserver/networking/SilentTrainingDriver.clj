(ns org.deeplearning4j.spark.parameterserver.networking.SilentTrainingDriver
  "This TrainingDriver implementation is suited ONLY for Spark Master, and handles application & redistribution of incoming encoded messages across distributed network"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.networking SilentTrainingDriver]))

(defn ->silent-training-driver
  "Constructor.

  params - `org.nd4j.linalg.api.ndarray.INDArray`
  step-function - `org.deeplearning4j.optimize.api.StepFunction`"
  (^SilentTrainingDriver [^org.nd4j.linalg.api.ndarray.INDArray params ^org.deeplearning4j.optimize.api.StepFunction step-function]
    (new SilentTrainingDriver params step-function))
  (^SilentTrainingDriver [^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (new SilentTrainingDriver accumulator)))

(defn add-completion-hook
  "originator-id - `long`
  frame-id - `long`
  message-id - `long`"
  ([^SilentTrainingDriver this ^Long originator-id ^Long frame-id ^Long message-id]
    (-> this (.addCompletionHook originator-id frame-id message-id))))

(defn bypass-mode
  "really-bypass - `boolean`"
  ([^SilentTrainingDriver this ^Boolean really-bypass]
    (-> this (.bypassMode really-bypass))))

(defn finish-training
  "This method is used on Master only, applies buffered updates to params

  originator-id - `long`
  task-id - `long`"
  ([^SilentTrainingDriver this ^Long originator-id ^Long task-id]
    (-> this (.finishTraining originator-id task-id))))

(defn get-updates-buffer
  "This method is viable only at Spark Workers, Master node will always have empty buffer here by design

  returns: `java.util.concurrent.BlockingQueue<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.concurrent.BlockingQueue [^SilentTrainingDriver this]
    (-> this (.getUpdatesBuffer))))

(defn aggregation-finished
  "aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  ([^SilentTrainingDriver this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.aggregationFinished aggregation))))

(defn target-message-class
  "returns: `java.lang.String`"
  (^java.lang.String [^SilentTrainingDriver this]
    (-> this (.targetMessageClass))))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`"
  ([^SilentTrainingDriver this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard]
    (-> this (.init void-configuration transport storage clipboard))))

(defn pick-training
  "message - `org.deeplearning4j.spark.parameterserver.networking.messages.SilentUpdatesMessage`"
  ([^SilentTrainingDriver this ^org.deeplearning4j.spark.parameterserver.networking.messages.SilentUpdatesMessage message]
    (-> this (.pickTraining message))))

(defn start-training
  "message - `org.deeplearning4j.spark.parameterserver.networking.messages.SilentUpdatesMessage`"
  ([^SilentTrainingDriver this ^org.deeplearning4j.spark.parameterserver.networking.messages.SilentUpdatesMessage message]
    (-> this (.startTraining message))))

