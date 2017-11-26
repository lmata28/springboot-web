<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cursos</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-md-8 offset-md-2">

                    <h1>${curso.id == null ? 'Nuevo Curso' : curso.nombre}</h1>
                    
                    <hr>
                    <form method="post" action="<%=request.getContextPath()%>/admin/curso/save">

                        <input type="hidden" value="${curso.id}" name="id">

                        <div class="form-group">
                            <label class="control-label">Programa</label>
                           <select type="text" name="programa.id" class="form-control">
                                <option></option>
                                <c:forEach var="p" items="${programas}">
                                    <option value="${p.id}" ${p.id == curso.programa.id ? 'selected' : ''} >${p.nombre}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                            <label class="control-label">Nombre</label>
                            <input type="text" name="nombre" class="form-control" value="${curso.nombre}" >
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="control-label">Código</label>
                                    <input type="text" name="codigo" class="form-control" value="${curso.codigo}" >
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="control-label">Fecha Inicio</label>
                                    <input type="text" name="fechaInicio" class="form-control" placeholder="dd/mm/yyyy" value="${curso.fechaInicioString}" >
                                </div>
                            </div>
                        </div>


                        <div class="form-group text-center mt-4">
                            <a class="btn btn-link" href="<%=request.getContextPath()%>/admin/curso"> Cancelar</a>
                            <button type="submit" class="btn btn-primary">Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
