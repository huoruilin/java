/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.NetworkingV1beta1HTTPIngressPath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://&lt;host&gt;/&lt;path&gt;?&lt;searchpart&gt; -&gt; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last &#39;/&#39; and before the first &#39;?&#39; or &#39;#&#39;.
 */
@ApiModel(description = "HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.")

public class NetworkingV1beta1HTTPIngressRuleValue {
  @SerializedName("paths")
  private List<NetworkingV1beta1HTTPIngressPath> paths = new ArrayList<NetworkingV1beta1HTTPIngressPath>();

  public NetworkingV1beta1HTTPIngressRuleValue paths(List<NetworkingV1beta1HTTPIngressPath> paths) {
    this.paths = paths;
    return this;
  }

  public NetworkingV1beta1HTTPIngressRuleValue addPathsItem(NetworkingV1beta1HTTPIngressPath pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * A collection of paths that map requests to backends.
   * @return paths
  **/
  @ApiModelProperty(required = true, value = "A collection of paths that map requests to backends.")
  public List<NetworkingV1beta1HTTPIngressPath> getPaths() {
    return paths;
  }

  public void setPaths(List<NetworkingV1beta1HTTPIngressPath> paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkingV1beta1HTTPIngressRuleValue networkingV1beta1HTTPIngressRuleValue = (NetworkingV1beta1HTTPIngressRuleValue) o;
    return Objects.equals(this.paths, networkingV1beta1HTTPIngressRuleValue.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkingV1beta1HTTPIngressRuleValue {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

