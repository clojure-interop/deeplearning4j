(ns org.deeplearning4j.zoo.model.TinyYOLO
  "Tiny YOLO
 Reference: https://arxiv.org/pdf/1612.08242.pdf
 ImageNet+VOC weights for this model are available and have been converted from https://pjreddie.com/darknet/yolo/
 using https://github.com/allanzelener/YAD2K and the following code.


      String filename = \"tiny-yolo-voc.h5\";
      ComputationGraph graph = KerasModelImport.importKerasModelAndWeights(filename, false);
      INDArray priors = Nd4j.create(priorBoxes);

      FineTuneConfiguration fineTuneConf = new FineTuneConfiguration.Builder()
              .seed(seed)
              .iterations(iterations)
              .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
              .gradientNormalization(GradientNormalization.RenormalizeL2PerLayer)
              .gradientNormalizationThreshold(1.0)
              .updater(new Adam.Builder().learningRate(1e-3).build())
              .l2(0.00001)
              .activation(Activation.IDENTITY)
              .trainingWorkspaceMode(workspaceMode)
              .inferenceWorkspaceMode(workspaceMode)
              .build();

      ComputationGraph model = new TransferLearning.GraphBuilder(graph)
              .fineTuneConfiguration(fineTuneConf)
              .addLayer(\"outputs\",
                      new Yolo2OutputLayer.Builder()
                              .boundingBoxPriors(priors)
                              .build(),
                      \"conv2d_9\")
              .setOutputs(\"outputs\")
              .build();

      System.out.println(model.summary(InputType.convolutional(416, 416, 3)));

      ModelSerializer.writeModel(model, \"tiny-yolo-voc_dl4j_inference.v1.zip\", false);
 The channels of the 416x416 input images need to be in RGB order (not BGR), with values normalized within [0, 1]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model TinyYOLO]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^TinyYOLO this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^TinyYOLO this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^TinyYOLO this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^TinyYOLO this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^TinyYOLO this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^TinyYOLO this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^TinyYOLO this input-shape]
    (-> this (.setInputShape input-shape))))

