package org.treblereel.mvp.view.css;

import org.gwtbootstrap3.client.ui.Pagination;
import org.gwtbootstrap3.client.ui.constants.ButtonType;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.gwt.ButtonCell;
import org.gwtbootstrap3.client.ui.gwt.CellTable;
import org.gwtbootstrap3.client.ui.gwt.DataGrid;
import org.gwtproject.cell.client.FieldUpdater;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.cellview.client.AbstractCellTable;
import org.gwtproject.user.cellview.client.Column;
import org.gwtproject.user.cellview.client.SimplePager;
import org.gwtproject.user.cellview.client.TextColumn;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;
import org.gwtproject.user.window.client.Window;
import org.gwtproject.view.client.ListDataProvider;
import org.gwtproject.view.client.RangeChangeEvent;
import org.treblereel.pojo.TableTestPojo;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class Tables extends Composite {

    @UiField(provided = true)
    DataGrid<TableTestPojo> dataGrid = new DataGrid<>(10);

    @UiField
    Pagination dataGridPagination;

    @UiField(provided = true)
    CellTable<TableTestPojo> cellTable = new CellTable<TableTestPojo>(10);

    @UiField
    Pagination cellTablePagination;

    @UiTemplate
    interface Binder extends UiBinder<Widget, Tables> {
        Tables.Binder INSTANCE = new Tables_BinderImpl();
    }

    private SimplePager dataGridPager = new SimplePager();
    private SimplePager cellTablePager = new SimplePager();
    private ListDataProvider<TableTestPojo> dataGridProvider = new ListDataProvider<>();
    private ListDataProvider<TableTestPojo> cellTableProvider = new ListDataProvider<>();

    public Tables() {
        initWidget(Tables.Binder.INSTANCE.createAndBindUi(this));

        initTable(dataGrid, dataGridPager, dataGridPagination, dataGridProvider);
        initTable(cellTable, cellTablePager, cellTablePagination, cellTableProvider);
        initMockData(dataGridPagination, dataGridPager, dataGridProvider);
        initMockData(cellTablePagination, cellTablePager, cellTableProvider);
    }

    private void initMockData(final Pagination pagination, final SimplePager simplePager, final ListDataProvider<TableTestPojo> dataProvider) {
        for (int i = 0; i < 25; i++) {
            dataProvider.getList().add(new TableTestPojo("Test " + i, "Test " + i, "Test " + i));
        }
        dataProvider.flush();
        pagination.rebuild(simplePager);
    }

    private void initTable(final AbstractCellTable<TableTestPojo> grid, final SimplePager pager, final Pagination pagination, final ListDataProvider<TableTestPojo> dataProvider) {
        final TextColumn<TableTestPojo> col1 = new TextColumn<TableTestPojo>() {

            @Override
            public String getValue(final TableTestPojo object) {
                return String.valueOf(object.getField1());
            }
        };
        grid.addColumn(col1, "Field 1");

        final TextColumn<TableTestPojo> col2 = new TextColumn<TableTestPojo>() {

            @Override
            public String getValue(final TableTestPojo object) {
                return String.valueOf(object.getField1());
            }
        };
        grid.addColumn(col2, "Field 2");

        final TextColumn<TableTestPojo> col3 = new TextColumn<TableTestPojo>() {

            @Override
            public String getValue(final TableTestPojo object) {
                return String.valueOf(object.getField1());
            }
        };
        grid.addColumn(col3, "Field 3");

        final Column<TableTestPojo, String> col4 = new Column<TableTestPojo, String>(new ButtonCell(ButtonType.PRIMARY, IconType.GITHUB)) {
            @Override
            public String getValue(TableTestPojo object) {
                return "Click Me";
            }
        };
        col4.setFieldUpdater((index, object, value) -> Window.alert("Clicked!"));
        grid.addColumn(col4, "Buttons");

        grid.addRangeChangeHandler(event -> pagination.rebuild(pager));

        pager.setDisplay(grid);
        pagination.clear();
        dataProvider.addDataDisplay(grid);
    }

}
