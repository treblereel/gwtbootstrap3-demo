package org.treblereel;

import org.gwtproject.event.logical.shared.ValueChangeEvent;
import org.gwtproject.event.logical.shared.ValueChangeHandler;
import org.gwtproject.event.shared.Event;
import org.gwtproject.event.shared.HandlerManager;
import org.gwtproject.user.client.ui.Panel;
import org.gwtproject.user.history.client.History;
import org.treblereel.mvp.Attachable;
import org.treblereel.mvp.presenter.MainPresenter;
import org.treblereel.mvp.presenter.MenuPresenter;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.presenter.components.AlertPresenter;
import org.treblereel.mvp.presenter.components.BadgePresenter;
import org.treblereel.mvp.presenter.components.BreadcrumbPresenter;
import org.treblereel.mvp.presenter.components.ButtonDropdownPresenter;
import org.treblereel.mvp.presenter.components.ButtonGroupPresenter;
import org.treblereel.mvp.presenter.components.DropdownPresenter;
import org.treblereel.mvp.presenter.components.IconPresenter;
import org.treblereel.mvp.presenter.components.InputGroupPresenter;
import org.treblereel.mvp.presenter.components.JumbotronPresenter;
import org.treblereel.mvp.presenter.components.LabelPresenter;
import org.treblereel.mvp.presenter.components.ListGroupPresenter;
import org.treblereel.mvp.presenter.components.MediaObjectPresenter;
import org.treblereel.mvp.presenter.components.NavPresenter;
import org.treblereel.mvp.presenter.components.NavbarPresenter;
import org.treblereel.mvp.presenter.components.PageHeaderPresenter;
import org.treblereel.mvp.presenter.components.PaginationPresenter;
import org.treblereel.mvp.presenter.components.PanelPresenter;
import org.treblereel.mvp.presenter.components.ProgressBarPresenter;
import org.treblereel.mvp.presenter.components.SuggestBoxPresenter;
import org.treblereel.mvp.presenter.components.ThumbnailPresenter;
import org.treblereel.mvp.presenter.components.WellPresenter;
import org.treblereel.mvp.presenter.css.ButtonsPresenter;
import org.treblereel.mvp.presenter.css.CodePresenter;
import org.treblereel.mvp.presenter.css.FormsPresenter;
import org.treblereel.mvp.presenter.css.GridSystemPresenter;
import org.treblereel.mvp.presenter.css.ImagesPresenter;
import org.treblereel.mvp.presenter.css.ResponsiveUtilitiesPresenter;
import org.treblereel.mvp.presenter.css.TablesPresenter;
import org.treblereel.mvp.presenter.css.TypographyPresenter;
import org.treblereel.mvp.presenter.extras.AnimatePresenter;
import org.treblereel.mvp.presenter.extras.BootboxJSPresenter;
import org.treblereel.mvp.presenter.extras.BootstrapPresenter;
import org.treblereel.mvp.presenter.extras.CardPresenter;
import org.treblereel.mvp.presenter.extras.DatePickerPresenter;
import org.treblereel.mvp.presenter.extras.DateTimePickerPresenter;
import org.treblereel.mvp.presenter.extras.FullCalendarPresenter;
import org.treblereel.mvp.presenter.extras.GalleryPresenter;
import org.treblereel.mvp.presenter.extras.NotifyPresenter;
import org.treblereel.mvp.presenter.extras.OfflinePresenter;
import org.treblereel.mvp.presenter.extras.SliderPresenter;
import org.treblereel.mvp.presenter.extras.SummernotePresenter;
import org.treblereel.mvp.presenter.extras.TagsInputPresenter;
import org.treblereel.mvp.presenter.extras.ToggleSwitchPresenter;
import org.treblereel.mvp.presenter.extras.TypeaheadPresenter;
import org.treblereel.mvp.presenter.javascript.AffixPresenter;
import org.treblereel.mvp.presenter.javascript.CarouselPresenter;
import org.treblereel.mvp.presenter.javascript.CollapsePresenter;
import org.treblereel.mvp.presenter.javascript.ModalPresenter;
import org.treblereel.mvp.presenter.javascript.PopoverPresenter;
import org.treblereel.mvp.presenter.javascript.TabPresenter;
import org.treblereel.mvp.presenter.javascript.TooltipPresenter;
import org.treblereel.mvp.view.MenuView;
import org.treblereel.place.NameTokens;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public class AppController implements Presenter,
                                      ValueChangeHandler<String> {

    public static Event.Type<Attachable.EventHandler> TYPE = new Event.Type<>();
    private HandlerManager eventBus = new HandlerManager(null);
    private Panel container;
    private MainPresenter mainPresenter = new MainPresenter();
    private MenuPresenter menuPresenter = new MenuPresenter();
    private ButtonsPresenter buttons = new ButtonsPresenter();
    private CodePresenter code = new CodePresenter();
    private FormsPresenter forms = new FormsPresenter();
    private GridSystemPresenter gridSystemPresenter = new GridSystemPresenter();
    private ImagesPresenter imagesPresenter = new ImagesPresenter();
    private ResponsiveUtilitiesPresenter responsiveUtilitiesPresenter = new ResponsiveUtilitiesPresenter();
    private TablesPresenter tablesPresenter = new TablesPresenter();
    private TypographyPresenter typographyPresenter = new TypographyPresenter();
    private AlertPresenter alertPresenter = new AlertPresenter();
    private BadgePresenter badgePresenter = new BadgePresenter();
    private BreadcrumbPresenter breadcrumbPresenter = new BreadcrumbPresenter();
    private ButtonDropdownPresenter buttonDropdownPresenter = new ButtonDropdownPresenter();
    private ButtonGroupPresenter buttonGroupPresenter = new ButtonGroupPresenter();
    private DropdownPresenter dropdownPresenter = new DropdownPresenter();
    private IconPresenter iconPresenter = new IconPresenter();
    private InputGroupPresenter inputGroupPresenter = new InputGroupPresenter();
    private JumbotronPresenter jumbotronPresenter = new JumbotronPresenter();
    private LabelPresenter labelPresenter = new LabelPresenter();
    private ListGroupPresenter listGroupPresenter = new ListGroupPresenter();
    private MediaObjectPresenter mediaObjectPresenter = new MediaObjectPresenter();
    private NavbarPresenter navbarPresenter = new NavbarPresenter();
    private NavPresenter navPresenter = new NavPresenter();
    private PageHeaderPresenter pageHeaderPresenter = new PageHeaderPresenter();
    private PaginationPresenter paginationPresenter = new PaginationPresenter();
    private PanelPresenter panelPresenter = new PanelPresenter();
    private ProgressBarPresenter progressBarPresenter = new ProgressBarPresenter();
    private SuggestBoxPresenter suggestBoxPresenter = new SuggestBoxPresenter();
    private ThumbnailPresenter thumbnailPresenter = new ThumbnailPresenter();
    private WellPresenter wellPresenter = new WellPresenter();

    private AffixPresenter affixPresenter = new AffixPresenter();
    private CarouselPresenter carouselPresenter = new CarouselPresenter();
    private CollapsePresenter collapsePresenter = new CollapsePresenter();
    private ModalPresenter modalPresenter = new ModalPresenter();
    private PopoverPresenter popoverPresenter = new PopoverPresenter();
    private TabPresenter tabPresenter = new TabPresenter();
    private TooltipPresenter tooltipPresenter = new TooltipPresenter();

    private AnimatePresenter animatePresenter = new AnimatePresenter();
    private BootboxJSPresenter bootboxJSPresenter = new BootboxJSPresenter();
    private BootstrapPresenter bootstrapPresenter = new BootstrapPresenter();
    private CardPresenter cardPresenter = new CardPresenter();
    private DatePickerPresenter datePickerPresenter = new DatePickerPresenter();
    private DateTimePickerPresenter dateTimePickerPresenter = new DateTimePickerPresenter();
    private FullCalendarPresenter fullCalendarPresenter = new FullCalendarPresenter();
    private GalleryPresenter galleryPresenter = new GalleryPresenter();
    private NotifyPresenter notifyPresenter = new NotifyPresenter();
    private OfflinePresenter offlinePresenter = new OfflinePresenter();
    private SliderPresenter sliderPresenter = new SliderPresenter();
    private SummernotePresenter summernotePresenter = new SummernotePresenter();
    private TagsInputPresenter tagsInputPresenter = new TagsInputPresenter();
    private ToggleSwitchPresenter toggleSwitchPresenter = new ToggleSwitchPresenter();
    private TypeaheadPresenter typeaheadPresenter = new TypeaheadPresenter();

    public AppController() {
        bind();
    }

    public void bind() {
        History.addValueChangeHandler(this);

        eventBus.addHandler(TYPE, event -> History.newItem(NameTokens.HOME));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(MenuView.class.getSimpleName()));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.BUTTONS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.CODE));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.FORMS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.GRID_SYSTEM));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.RESPONSIVE_UTILITIES));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TABLES));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TYPOGRAPHY));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.ALERTS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.BADGES));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.BREADCRUMBS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.BUTTON_DROPDOWNS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.BUTTON_GROUPS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.DROPDOWNS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.ICONS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.INPUT_GROUPS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.JUMBOTRON));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.LABELS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.LIST_GROUP));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.MEDIA_OBJECTS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.NAVBAR));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.NAVS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.PAGE_HEADER));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.PAGINATION));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.PANELS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.PROGRESS_BARS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.SUGGEST_BOX));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.THUMBNAILS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.WELLS));

        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.AFFIX));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.CAROUSEL));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.COLLAPSE));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.MODALS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.POPOVER));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TABS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TOOLTIPS));

        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.ANIMATE));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.BOOTBOX));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.SELECT));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.CARD));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.DATE_PICKER));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.DATETIME_PICKER));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.FULL_CALENDAR));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.GALLERY));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.NOTIFY));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.OFFLINE));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.SLIDER));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TABS));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TOGGLESWITCH));
        eventBus.addHandler(TYPE,
                            event -> History.newItem(NameTokens.TYPEAHEAD));
    }

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {
        String token = event.getValue();
        container.clear();

        if (token != null) {
            if (token.equals(NameTokens.HOME) || token.equals("#")) {
                mainPresenter.dispatch(container);
            } else if (token.equals(MenuView.class.getSimpleName())) {
                menuPresenter.dispatch(container);
            } else if (token.equals(NameTokens.BUTTONS)) {
                buttons.dispatch(container);
            } else if (token.equals(NameTokens.CODE)) {
                code.dispatch(container);
            } else if (token.equals(NameTokens.FORMS)) {
                forms.dispatch(container);
            } else if (token.equals(NameTokens.GRID_SYSTEM)) {
                gridSystemPresenter.dispatch(container);
            } else if (token.equals(NameTokens.IMAGES)) {
                imagesPresenter.dispatch(container);
            } else if (token.equals(NameTokens.RESPONSIVE_UTILITIES)) {
                responsiveUtilitiesPresenter.dispatch(container);
            } else if (token.equals(NameTokens.TABLES)) {
                tablesPresenter.dispatch(container);
            } else if (token.equals(NameTokens.TYPOGRAPHY)) {
                typographyPresenter.dispatch(container);
            } else if (token.equals(NameTokens.ALERTS)) {
                alertPresenter.dispatch(container);
            } else if (token.equals(NameTokens.BADGES)) {
                badgePresenter.dispatch(container);
            } else if (token.equals(NameTokens.BREADCRUMBS)) {
                breadcrumbPresenter.dispatch(container);
            } else if (token.equals(NameTokens.BUTTON_DROPDOWNS)) {
                buttonDropdownPresenter.dispatch(container);
            } else if (token.equals(NameTokens.BUTTON_GROUPS)) {
                buttonGroupPresenter.dispatch(container);
            } else if (token.equals(NameTokens.DROPDOWNS)) {
                dropdownPresenter.dispatch(container);
            } else if (token.equals(NameTokens.ICONS)) {
                iconPresenter.dispatch(container);
            } else if (token.equals(NameTokens.INPUT_GROUPS)) {
                inputGroupPresenter.dispatch(container);
            } else if (token.equals(NameTokens.JUMBOTRON)) {
                jumbotronPresenter.dispatch(container);
            } else if (token.equals(NameTokens.LABELS)) {
                labelPresenter.dispatch(container);
            } else if (token.equals(NameTokens.LIST_GROUP)) {
                listGroupPresenter.dispatch(container);
            } else if (token.equals(NameTokens.MEDIA_OBJECTS)) {
                mediaObjectPresenter.dispatch(container);
            } else if (token.equals(NameTokens.NAVBAR)) {
                navbarPresenter.dispatch(container);
            } else if (token.equals(NameTokens.NAVS)) {
                navPresenter.dispatch(container);
            } else if (token.equals(NameTokens.PAGE_HEADER)) {
                pageHeaderPresenter.dispatch(container);
            } else if (token.equals(NameTokens.PAGINATION)) {
                paginationPresenter.dispatch(container);
            } else if (token.equals(NameTokens.PANELS)) {
                panelPresenter.dispatch(container);
            } else if (token.equals(NameTokens.PROGRESS_BARS)) {
                progressBarPresenter.dispatch(container);
            } else if (token.equals(NameTokens.SUGGEST_BOX)) {
                suggestBoxPresenter.dispatch(container);
            } else if (token.equals(NameTokens.THUMBNAILS)) {
                thumbnailPresenter.dispatch(container);
            } else if (token.equals(NameTokens.WELLS)) {
                wellPresenter.dispatch(container);
            } else if (token.equals(NameTokens.AFFIX)) {
                affixPresenter.dispatch(container);
            } else if (token.equals(NameTokens.COLLAPSE)) {
                collapsePresenter.dispatch(container);
            } else if (token.equals(NameTokens.POPOVER)) {
                popoverPresenter.dispatch(container);
            } else if (token.equals(NameTokens.TABS)) {
                tabPresenter.dispatch(container);
            } else if (token.equals(NameTokens.TOOLTIPS)) {
                tooltipPresenter.dispatch(container);
            } else if (token.equals(NameTokens.CAROUSEL)) {
                carouselPresenter.dispatch(container);
            } else if (token.equals(NameTokens.MODALS)) {
                modalPresenter.dispatch(container);
            } else if (token.equals(NameTokens.ANIMATE)) {
                animatePresenter.dispatch(container);
            } else if (token.equals(NameTokens.BOOTBOX)) {
                bootboxJSPresenter.dispatch(container);
            } else if (token.equals(NameTokens.CARD)) {
                cardPresenter.dispatch(container);
            } else if (token.equals(NameTokens.DATE_PICKER)) {
                datePickerPresenter.dispatch(container);
            } else if (token.equals(NameTokens.DATETIME_PICKER)) {
                dateTimePickerPresenter.dispatch(container);
            } else if (token.equals(NameTokens.FULL_CALENDAR)) {
                fullCalendarPresenter.dispatch(container);
            } else if (token.equals(NameTokens.GALLERY)) {
                galleryPresenter.dispatch(container);
            } else if (token.equals(NameTokens.NOTIFY)) {
                notifyPresenter.dispatch(container);
            } else if (token.equals(NameTokens.OFFLINE)) {
                offlinePresenter.dispatch(container);
            } else if (token.equals(NameTokens.SLIDER)) {
                sliderPresenter.dispatch(container);
            } else if (token.equals(NameTokens.SUMMERNOTE)) {
                summernotePresenter.dispatch(container);
            } else if (token.equals(NameTokens.TAGSINPUT)) {
                tagsInputPresenter.dispatch(container);
            } else if (token.equals(NameTokens.TOGGLESWITCH)) {
                toggleSwitchPresenter.dispatch(container);
            } else if (token.equals(NameTokens.TYPEAHEAD)) {
                typeaheadPresenter.dispatch(container);
            } else if (token.equals(NameTokens.SELECT)) {
                bootstrapPresenter.dispatch(container);
            }
        }
    }

    @Override
    public void dispatch(Panel container) {
        this.container = container;
        if ("".equals(History.getToken())) {
            History.newItem(NameTokens.HOME);
        } else {
            History.fireCurrentHistoryState();
        }
    }
}
