
package suryagaddipati.jenkinsdockerslaves.docker.api.task;

import akka.http.javadsl.model.HttpMethods;
import suryagaddipati.jenkinsdockerslaves.docker.api.request.ApiRequest;
import suryagaddipati.jenkinsdockerslaves.docker.marshalling.ResponseType;

public class ListTasksRequest extends ApiRequest {

    public ListTasksRequest() {
        super(HttpMethods.GET, "/tasks", Task.class, ResponseType.LIST);
    }
    public ListTasksRequest(String dockerSwarmApiUrl, String url) {
        super(HttpMethods.GET, dockerSwarmApiUrl, url, Task.class, ResponseType.LIST);
    }


    public  ListTasksRequest(String dockerApiUrl, String filterKey, String filterValue){
        this(dockerApiUrl, "/tasks?filters="+encodeJsonFilter(filterKey,filterValue));
    }
}
