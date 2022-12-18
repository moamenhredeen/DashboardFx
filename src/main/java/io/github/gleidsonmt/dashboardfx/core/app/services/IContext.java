/*
 *
 *    Copyright (C) Gleidson Neves da Silveira
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package io.github.gleidsonmt.dashboardfx.core.app.services;

import io.github.gleidsonmt.dashboardfx.core.app.interfaces.*;
import io.github.gleidsonmt.dashboardfx.core.layout.Root;

import java.util.Properties;
import java.util.logging.Logger;

public class IContext implements Context {
    private Routes routes;
    private Root root;

    public IContext() {

    }

    public void setRoutes(Routes _routes) {
        this.routes = _routes;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    @Override
    public Routes routes() {
        return routes;
    }

    @Override
    public ILayout layout() {
        return root.getLayout();
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public Logger getLogger() {
        return null;
    }

    @Override
    public IDecorator getDecorator() {
        return null;
    }

    @Override
    public IWrapper getWrapper() {
        return null;
    }

    @Override
    public ILayout getLayout() {
        return null;
    }

    @Override
    public Routes getRoutes() {
        return null;
    }

    @Override
    public PathView getPaths() {
        return null;
    }

    @Override
    public void openLink(String url) {

    }

    public Root getRoot() {
        return root;
    }
}
