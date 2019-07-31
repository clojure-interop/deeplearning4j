(ns org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener
  "CheckpointListener: The goal of this listener is to periodically save a copy of the model during training..
 Model saving may be done:
 1. Every N epochs
 2. Every N iterations
 3. Every T time units (every 15 minutes, for example)
 Or some combination of the 3.

 Models can be restored using loadCheckpointMLN(Checkpoint) and loadCheckpointCG(Checkpoint).
 Model files can be obtained using getFileForCheckpoint(Checkpoint)
 Checkpoints can be obtained using lastCheckpoint() and availableCheckpoints()

 Example 1: Saving a checkpoint every 2 epochs, keep all model files


   CheckpointListener l = new CheckpointListener.Builder(\"/save/directory\")
        .keepAll() //Don't delete any models
        .saveEveryNEpochs(2)
        .build()

 Example 2: Saving a checkpoint every 1000 iterations, but keeping only the last 3 models (all older model
 files will be automatically deleted)


   CheckpointListener l = new CheckpointListener.Builder(new File(\"/save/directory\"))
           .keepLast(3)
           .saveEveryNIterations(1000)
           .build();

 Example 3: Saving a checkpoint every 15 minutes, keeping the most recent 3 and otherwise every 4th checkpoint
 file:


   CheckpointListener l = new CheckpointListener.Builder(new File(\"/save/directory\"))
           .keepLastAndEvery(3, 4)
           .saveEvery(15, TimeUnit.MINUTES)
           .build();

 Note that you can mix these: for example, to save every epoch and every 15 minutes (independent of last save time):
 .saveEveryEpoch().saveEvery(15, TimeUnit.MINUTES)
 To save every epoch, and every 15 minutes, since the last model save use:
 .saveEveryEpoch().saveEvery(15, TimeUnit.MINUTES, true)
 Note that is this last example, the sinceLast parameter is true. This means the 15-minute counter will be
 reset any time a model is saved."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners.checkpoint CheckpointListener]))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^CheckpointListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^CheckpointListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn available-checkpoints
  "List all available checkpoints. A checkpoint is 'available' if the file can be loaded. Any checkpoint files that
  have been automatically deleted (given the configuration) will not be returned here.

  returns: List of checkpoint files that can be loaded - `java.util.List<org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint>`"
  (^java.util.List [^CheckpointListener this]
    (-> this (.availableCheckpoints))))

(defn last-checkpoint
  "Return the most recent checkpoint, if one exists - otherwise returns null

  returns: Checkpoint - `org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint [^CheckpointListener this]
    (-> this (.lastCheckpoint))))

(defn get-file-for-checkpoint
  "Get the model file for the given checkpoint. Checkpoint model file must exist

  checkpoint - Checkpoint to get the model file for - `org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint`

  returns: Model file for the checkpoint - `java.io.File`"
  (^java.io.File [^CheckpointListener this ^org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint checkpoint]
    (-> this (.getFileForCheckpoint checkpoint))))

(defn load-checkpoint-mln
  "Load a MultiLayerNetwork for the given checkpoint

  checkpoint - Checkpoint model to load - `org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint`

  returns: The loaded model - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^CheckpointListener this ^org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint checkpoint]
    (-> this (.loadCheckpointMLN checkpoint))))

(defn load-checkpoint-cg
  "Load a ComputationGraph for the given checkpoint

  checkpoint - Checkpoint model to load - `org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint`

  returns: The loaded model - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^CheckpointListener this ^org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint checkpoint]
    (-> this (.loadCheckpointCG checkpoint))))

